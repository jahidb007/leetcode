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
         ListNode temp = head;
        ListNode dummyHead = new ListNode(-1000);
        ListNode response = dummyHead;


        for (int i = 1; i < left; i++) {
            dummyHead.next = temp;
            temp = temp.next;
            dummyHead = dummyHead.next;
        }



        ListNode rightStart = head;

        for (int i = 1; i <= right; i++) {
            rightStart = rightStart.next;
        }

        ListNode reverse = reverseIt(temp, left, right);

        while (reverse != null) {
            dummyHead.next = reverse;
            reverse = reverse.next;
            dummyHead = dummyHead.next;
        }

        while (rightStart != null) {
            dummyHead.next = rightStart;
            rightStart = rightStart.next;
            dummyHead = dummyHead.next;
        }

        return response.next;

    }

      private  ListNode reverseIt(ListNode reverseNode, int left, int right) {
        ListNode lst = reverseNode;
        if (left == right) {
            reverseNode.next = null;
            return reverseNode;
        }
        lst = reverseIt(reverseNode.next, left + 1, right);
        ListNode tempLst = lst;
        while (tempLst.next != null) {
            tempLst = tempLst.next;
        }
        tempLst.next = reverseNode;
        tempLst = tempLst.next;
        tempLst.next = null;
        return lst;

    }
}