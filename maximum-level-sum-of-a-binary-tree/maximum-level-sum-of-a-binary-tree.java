/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int level = 0;
        int maxSum = -999999999;
        int maxLevel = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            int currentSum = 0;
            level++;
            int size = queue.size();


            while (size >0) {
                size--;
                TreeNode tempNode = queue.poll();
                currentSum = currentSum + tempNode.val;


                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }


                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }

            if(currentSum > maxSum){
                maxLevel = level;
                maxSum = currentSum;
            }


        }

return maxLevel;
    }
}