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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        ListNode result = new ListNode();
        ListNode cur = result;
        while(head != null){
            if(!set.contains(head.val)){
                result.next = head;
                result = result.next;
            }

            head = head.next;
        }

        result.next = null;

        return cur.next;
    }
}