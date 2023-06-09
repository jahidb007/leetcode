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
      return  doAdding(l1, l2, 0);
    }

    public ListNode doAdding(ListNode l1, ListNode l2, int carry) {

        if (l1 == null && l2 == null && carry ==0) {
            return null;
        }
        int x;
        int y;
        if(l1 == null) {
            l1 = new ListNode();
        }
        if(l2 == null){
            l2 = new ListNode();
        }
        x = l1.val;
        y = l2.val;
        int total = x + y + carry;

        int res = total % 10;
        carry = total / 10;

        ListNode listNode = new ListNode(res,doAdding(l1.next, l2.next, carry));
        return listNode;


    }
}