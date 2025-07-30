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
    public ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null || k == 0) return head;

        ListNode last = head;
        int size = 1;
        while(last.next != null){
            size++;
            last = last.next;
        }
        k = k % size;
        if(k ==0)return head;
        int i= 1;
        ListNode temp = head;
        while(i<size-k && temp != null){
            temp = temp.next;
            i++;
        }
        if(temp == null)return head;
        ListNode newHead = temp.next;
        last.next = head;
        temp.next = null;
        return newHead;


    }
}
