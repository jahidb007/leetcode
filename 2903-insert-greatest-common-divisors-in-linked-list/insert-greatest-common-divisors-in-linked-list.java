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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        int prev = curr.val;

        while(curr.next != null){
            int next = curr.next.val;
            int gcd = gcd(prev, next);
            ListNode ins = new ListNode(gcd);
            System.out.println(gcd);
            
            prev = curr.next.val;
            
            
            ins.next = curr.next;
            curr.next = ins;
            
            
            curr = ins.next;
        }
        
        return head;

    }

    public int gcd(int i, int j){
        if (j != 0)
            return gcd(j, i % j);
        else
            return i;
    }
}