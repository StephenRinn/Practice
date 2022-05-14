/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode output;
        
        if(head == null){return null;}
        
        while(head.next != null){
            stack.push(head);
            head = head.next;
        }
        
        output = head;
        
        while(!stack.isEmpty()){
            head.next = stack.pop();
            head = head.next;
        }
        
        head.next = null;
        
        return output;
    }
}