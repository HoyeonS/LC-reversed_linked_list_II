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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode check = head;
        
        for(int i = 0; i < left - 1; i++) {
            check = check.next;
        }
        
        int[] temp = new int[right - left + 1];
        
        ListNode rev = check;
        temp[0] = rev.val;
        
        for(int i = 1; i < right - left + 1; i++) {
            
            rev = rev.next;
            temp[i] = rev.val;
        }
        
        for(int i = temp.length - 1; i > -1; i--) {
            check.val = temp[i];
            check = check.next;
        }
        
        return head;
        
    }
}