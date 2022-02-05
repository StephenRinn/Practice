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
        }
        
        ListNode solution = lists[0];
        
        for(int i = 1; i < lists.length; i++){
            solution = Merge(solution,lists[i]);
        }
        
        return solution;
    }
    
    private ListNode Merge(ListNode first, ListNode second){
        
        if(first == null){
            return second;
        }else if(second == null){
            return first;
        }
        
        if(first.val < second.val){
            first.next = Merge(first.next,second);
            return first;
        }else{
            second.next = Merge(first,second.next);
            return second;
        }
        
    }
}