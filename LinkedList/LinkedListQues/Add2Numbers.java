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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        while(temp1 != null || temp2 != null || carry>0 ){
            int val1 = (temp1 != null)?temp1.val:0;
             int val2 = (temp2 != null)?temp2.val:0;
             int sum = val1+val2+carry;
             carry = sum/10;
             temp.next = new ListNode(sum%10);
             temp = temp.next;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;

        }
        return head.next;
    }
}
