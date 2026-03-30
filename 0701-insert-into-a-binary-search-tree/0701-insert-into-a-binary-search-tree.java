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



    static void insertBinarySearchTree(TreeNode root, int val,TreeNode prev){

        if(root==null){
            TreeNode temp = new TreeNode(val);
            if(prev.val<val){
                prev.right=temp;
            }
            else{
                prev.left=temp;
            }
            return;
        }

        if(root.val<val){ // move right side;

          insertBinarySearchTree(root.right,val,root);

        }
        if(root.val>val){ // move left side
            insertBinarySearchTree(root.left,val,root);

        }


            
        }



    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode prev= null;
        if(root==null){
             TreeNode temp = new TreeNode(val);
            
            return temp;
        }
        insertBinarySearchTree(root,val,prev);
        return root;
    }
}