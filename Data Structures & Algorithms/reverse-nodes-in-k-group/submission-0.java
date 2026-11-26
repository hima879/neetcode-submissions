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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while(count<k && curr!=null){
                curr = curr.next;
                count++;
        }
        if(count<k) return head;
        ListNode reverse = reverseKGroup(curr,k);
        ListNode prev = null;
        ListNode current = head;
        for(int i =0;i<k;i++){
            ListNode nextTemp = current.next;
            current.next = prev;
            prev=current;
            current=nextTemp;
        }
        head.next = reverse;
        return prev;
        
    }
}
