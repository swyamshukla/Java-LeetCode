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
    static int max=0;

    public static int depth(TreeNode root){
        if(root==null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        max=Math.max(left+right,max);

        return 1 + Math.max(left,right);

    }

    public static void helper(TreeNode root){
        if(root==null) return;

        depth(root);
        helper(root.left);
        helper(root.right);
    }


    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        helper(root);
        return max;
    }   
}