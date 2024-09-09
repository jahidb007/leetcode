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

        ListNode temp = head;
        int p = 0;
        int count = 0;
        
        for(int i = 0 ; i < k ; i++){
            if(temp == null){
                break;
            }
            ListNode t = temp;
            result[i] = t;
            for(int j = 0 ; j < div ; j++){
                t = temp;
                temp = temp.next;
                
            }

            if(rem > 0 ){
                rem--;
                t = temp;
                temp = temp.next;
               
            }

            if(t != null){
                t.next = null;
            }
            
        }

        return result;
    }
}