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
        if(left == right)return head;
        ListNode prev = null;
        ListNode curr = head;
        int i=1;
        while(i<left && curr != null){
            prev = curr;
            curr = curr.next;
            i++;
        }
        if(curr == null)return head;
        ListNode last = prev;
        ListNode newEnd = curr;
        ListNode next ;
        while(left<=right && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            left++;
        }
        if(last != null){
            last.next = prev;
        }
        else{
           head = prev;
        }
        newEnd.next = curr;
        return head;

    }
}
