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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode less = new ListNode(-1);
        ListNode greater = new ListNode(1);
        ListNode low = less;
        ListNode gret = greater;
        while(temp != null){
            if(temp.val <x){
                low.next = temp;
                low = low.next;
            }
            else{
                gret.next = temp;
                gret = gret.next;
            }
            temp = temp.next;
        }
        low.next = greater.next;
        gret.next = null;

        return less.next;

    }
}
