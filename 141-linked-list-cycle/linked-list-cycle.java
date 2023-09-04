/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();
        boolean loopDetected = false;
        while (head != null){
            if(listNodes.contains(head)){
                loopDetected = true;
                break;
            }
            listNodes.add(head);
            head = head.next;
        }
        return loopDetected; 
    }
}