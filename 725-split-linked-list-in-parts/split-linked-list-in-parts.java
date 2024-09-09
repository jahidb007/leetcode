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
        ListNode curr = head;

        int len = 0;

        while(curr != null){
            len++;
            curr = curr.next;
        }
        int div = len / k;
        int rem = len % k;

        ListNode[] result = new ListNode[k];

        curr = head;
        ListNode prev = curr;
        
        for(int i = 0 ; i < k ; i++){
            
            ListNode newPart = curr;

            int currSize = div;
            if(rem > 0){
                rem--;
                currSize++;
            }

            int j = 0;
            while(j < currSize){
                prev = curr;
                curr = curr.next;
                j++;
            }

            if(prev != null){
                prev.next = null;
            }

            result[i] = newPart;
            
        }

        return result;
    }
}