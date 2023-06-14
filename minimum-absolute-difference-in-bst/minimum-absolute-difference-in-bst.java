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
    List<Integer> integers = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
         travarse(root);
         return  getMinimumValue(integers);
    }


    public void travarse(TreeNode root) {

        if(root == null){
            return;
        }

      if(root.left!=null){
        travarse(root.left);
      }
      integers.add(root.val);
      if(root.right!=null){
      travarse(root.right);
      }


    }

 private int getMinimumValue(List<Integer> integers) {
        int min = 999999;
        for(int i= 1;i <integers.size();i++){
            if((integers.get(i) - integers.get(i-1))<min){
                min = integers.get(i) - integers.get(i-1);
            }
        }
        return min;

    }


}