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
    static int answer=0;
    public static void paths(TreeNode root, long targetSum){
        if(root==null) return;

        if(root.val == targetSum){
            answer++;
        }

        paths(root.left, targetSum - root.val);
        paths(root.right, targetSum - root.val);
    }

    public static void helper(TreeNode root,int targetSum){
        if(root==null) return;

        paths(root,targetSum);

        helper(root.left,targetSum);
        helper(root.right,targetSum);
    }
    public int pathSum(TreeNode root, int targetSum) {
        answer=0;
        helper(root,targetSum);
        return answer;
    }
}