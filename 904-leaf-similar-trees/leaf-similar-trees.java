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

    List<Integer> leaff = new ArrayList();
    List<Integer> leafs = new ArrayList();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        getLeafs(root1,leaff);
        getLeafs(root2,leafs);

        if(leafs.size() != leaff.size()){
            return false;
        }
        
        for(int i = 0 ; i < leaff.size() ; i++){
           // System.out.println(leaff.get(i) +" - "+ leafs.get(i) );
            if(leaff.get(i) == leafs.get(i)){
                continue;
            }else return false;
        }

        return true;

    }

    public void getLeafs(TreeNode root,List<Integer> leaf){
        
        if(root.left == null && root.right == null){
           // System.out.println(root.val);
            leaf.add(root.val);
            return;
        }

        if(root.left != null) getLeafs(root.left,leaf);
        if(root.right != null) getLeafs(root.right,leaf);

    }
}