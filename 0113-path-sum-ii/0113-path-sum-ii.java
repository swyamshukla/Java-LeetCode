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

    static void helper(TreeNode root, int targetSum,List<Integer> temp,List<List<Integer>> result,int curr){
        if(root==null)return;
        curr+=root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null){
            if(curr==targetSum){
                result.add(new ArrayList<>(temp));
            }
        }
         helper( root.left, targetSum, temp, result,curr);
          helper( root.right, targetSum, temp, result,curr);
          temp.remove(temp.size()-1); // backtrakcking 
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper( root, targetSum, temp, result,0);

        return result;

    }
}