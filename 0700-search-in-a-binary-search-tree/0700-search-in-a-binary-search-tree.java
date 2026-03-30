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
        
        static TreeNode binarySearchTree(TreeNode root, int val){

            if(root==null) return null;

            if(root.val==val) return root;
            if(root.val>val) return binarySearchTree(root.left,val);
            if(root.val<val)  return binarySearchTree(root.right,val);

            return null;
        }

    
    public TreeNode searchBST(TreeNode root, int val) {
        return binarySearchTree(root,val);
    }
}