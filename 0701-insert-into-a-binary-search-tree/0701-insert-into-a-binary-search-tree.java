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

    void insert(TreeNode root,int val,TreeNode prev){

        // if(root==null){
        //     TreeNode temp = new TreeNode(val);
        //     if(prev.val>val){
        //         prev.left=temp;
        //     }
        //     else{
        //         prev.right=temp;

        //     }
        //     return;
        // }


         if(root.val<val) {
            if(root.right==null){
                TreeNode temp = new TreeNode(val);
                root.right=temp;
                return;
            }
            insert(root.right,val,root);
         }
         if(root.val>val) {
            if(root.left==null){
                 TreeNode temp = new TreeNode(val);
                root.left=temp;
                return;     
            }

            insert(root.left,val,root);
         }

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode temp = new TreeNode(val);
            return temp;
        }
        insert(root,val,null);
        return root;
        




    }
}