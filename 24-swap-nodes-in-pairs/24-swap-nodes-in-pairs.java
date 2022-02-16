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
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head.next;
        ListNode output = head.next;
        ListNode postSwap = head.next.next;
        
        head.next = head.next.next;
        temp.next = head;
        ListNode prev = head;
        
        while(prev.next != null && prev.next.next != null){
            temp = prev.next;
            postSwap = temp.next.next;
            prev.next = prev.next.next;
            prev.next.next = temp;
            prev.next.next.next = postSwap;
            prev = prev.next.next;
        }
        
        return output;
    }
    
}