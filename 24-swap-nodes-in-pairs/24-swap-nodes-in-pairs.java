class Solution {
    public ListNode swapPairs(ListNode head) {
        
        // edge case for null or single node
        if(head == null || head.next == null){
            return head;
        }
        
        // Set up for swapping
        ListNode temp = head.next;
        ListNode output = head.next;
        ListNode postSwap = head.next.next;
        
        // First swap with no previous
        head.next = head.next.next;
        temp.next = head;
        ListNode prev = head;
        
        // While loop for later swapping
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