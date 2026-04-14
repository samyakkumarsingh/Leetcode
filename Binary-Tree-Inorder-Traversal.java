1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> list=new ArrayList<>();
19        return inOrder(root,list);
20    }
21    public List<Integer> inOrder(TreeNode node,List<Integer> list){
22        if(node==null) return list;
23        inOrder(node.left,list);
24        list.add(node.val);
25        inOrder(node.right,list);
26        return list;
27    }
28
29}