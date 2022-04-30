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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }else if(lists.length == 1){
            return lists[0];
        }
        
        ListNode newHead = new ListNode();
        newHead = mergeTwoLists(lists[0],lists[1]);
        
        if(lists.length > 2){
            for(int i = 2; i < lists.length; i++){
                newHead = mergeTwoLists(newHead,lists[i]);
            }
        }
        return newHead;
    }
    
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode currentPos = head;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                currentPos.next = list1;
                list1 = list1.next;
            }else {
                currentPos.next = list2;
                list2 = list2.next;
            }
            currentPos = currentPos.next;
        }
        
        if(list1 != null){
            currentPos.next = list1;
        }
        
        if(list2 != null){
            currentPos.next = list2;
        }
        
        return head.next;
    }
}