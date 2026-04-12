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
    static int sum=0;
  static void inorder(TreeNode root,List<Integer> list,List<TreeNode> tree){
        if(root==null) return ;
        inorder(root.left,list,tree);
        sum+=root.val;
        list.add(root.val);
        tree.add(root);
        inorder(root.right,list,tree);        
    }



    public TreeNode convertBST(TreeNode root) {
        sum=0;

        List<Integer> list = new ArrayList<>();
     
        List<TreeNode> trees = new ArrayList<>();

        List<Integer> answer = new ArrayList<>();
           inorder(root,list,trees);
        answer.add(sum);
        for(int i=1;i<list.size();i++){
            answer.add(answer.get(i-1)-list.get(i-1));
        }

        for(int i=0;i<trees.size();i++){
            trees.get(i).val=answer.get(i);
        }

        return root;
    
  
    }
}