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

    // void bfs(TreeNode root,List<Integer> hold, List<List<Integer>> result){
        
    // }

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q= new LinkedList<>();

        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        q.add(root);
        while(!q.isEmpty()){
            int size =q.size();
            List<Integer> arr = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                 TreeNode temp =q.remove();
                 arr.add(temp.val);
                 if(temp.left!=null) q.add(temp.left);
                 if(temp.right!=null) q.add(temp.right);

            }
            result.add(arr);
        }
        return result;

    }
}