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
    ArrayList<Integer> ans=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
            call(root);
            return ans;
    }

    public void call(TreeNode root){
            if(root==null) return;
            ans.add(root.val);
            call(root.left);
            call(root.right);
    }
}