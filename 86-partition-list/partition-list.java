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
      
      if(head == null){
          return head;
      }
      
       ListNode checker = head;

        ListNode leftNode = new ListNode();
        ListNode temp = leftNode;
        ListNode rightNode = new ListNode();
        ListNode tempr = rightNode;
        do {
            if (checker.val < x) {
                temp.next = new ListNode(checker.val);
                temp = temp.next;
            } else {
                tempr.next = new ListNode(checker.val);
                tempr = tempr.next;
            }


            checker = checker.next;
        } while (checker != null);

        leftNode = leftNode.next;
        rightNode = rightNode.next;

        ListNode finalNode = new ListNode();
        ListNode finalTemp = finalNode;
        while (leftNode != null) {
            finalTemp.next = leftNode;
            finalTemp = finalTemp.next;
            leftNode = leftNode.next;
        }

        while (rightNode != null) {
            finalTemp.next = rightNode;
            finalTemp = finalTemp.next;
            rightNode = rightNode.next;
        }

        return finalNode.next;  
    }
}