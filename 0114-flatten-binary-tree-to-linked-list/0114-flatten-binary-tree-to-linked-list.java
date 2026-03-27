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
    void preOrder(TreeNode root,List<TreeNode> result){
        if(root==null) return ;

        result.add(root);
        preOrder(root.left,result);
        preOrder(root.right,result);
    }

    public void flatten(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        preOrder(root,result);
        System.out.println(result);
        for(int i=0;i<result.size()-1;i++){
            result.get(i).right=result.get(i+1);
            result.get(i).left=null;
        }


        
    }
}