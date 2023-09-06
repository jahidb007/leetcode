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
    public ListNode[] splitListToParts(ListNode head, int k) {
           int l = 0;
        ListNode temp = head;
        while (temp != null) {
            l++;
            temp = temp.next;
        }


        temp = head;
        int perBlock = l / k;
        int extra = l % k;

        ListNode[] list = new ListNode[k];

        int p = 0;
        while (temp != null) {

            ListNode block = new ListNode(temp.val);
            list[p] = block;
            for (int i = 1; i < perBlock; i++) {
                block.next = new ListNode(temp.next.val);
                block = block.next;
                temp = temp.next;
            }

            if (extra > 0 && perBlock !=0) {
                extra--;
                block.next = new ListNode(temp.next.val);
                block = block.next;
                temp = temp.next;
            }


            temp = temp.next;

            p++;
        }


        while (list.length != k) {
            list[p] = null;
            p++;
        }
        return list;
    }
}