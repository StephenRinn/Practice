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
import static java.lang.Math.*;

class Solution {
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