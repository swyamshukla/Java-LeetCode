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

    public static int count(TreeNode root){
        if(root==null) return 0;
        return 1+ count(root.left)+count(root.right);
    }

    public boolean check(TreeNode root,int idx,int count){
        if(root==null) return true;
        if(idx>=count) return false;
        return check(root.left,2*idx+1,count) && check(root.right,2*idx+2,count);


    }

    public boolean isCompleteTree(TreeNode root) {
        int count = count(root);
       return check(root,0,count);
        
    }
}