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
        if(head == null || head.next == null)return head;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode curr = head;
        int size  = 0;
        while(curr !=null){
            size++;
            curr = curr.next;
        }
        curr = head;
        while(size>=k){
        ListNode prev = null;
        ListNode tail = curr;
        ListNode next;

          for(int i=0;i<k;i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            temp.next = prev;
            tail.next = curr;
            temp = tail;
            size-=k;


        }
        return dummy.next;

    }
}
