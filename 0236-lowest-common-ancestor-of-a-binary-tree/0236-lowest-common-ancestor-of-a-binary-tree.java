/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

 static boolean check(TreeNode root, TreeNode target, List<TreeNode> path){
        if(root == null) return false;

        path.add(root);

        if(root == target) return true;

        if(check(root.left, target, path) || 
           check(root.right, target, path)) {
            return true;
        }

        path.remove(path.size() - 1); // backtrack
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();

        check(root,p,pList);
        check(root,q,qList);

        TreeNode ans=null;

        for(int i=0;i<Math.min(pList.size(),qList.size());i++){
            if(pList.get(i)==qList.get(i)){
                ans = qList.get(i);
            }
            else{
                break;
            }
        }
        return ans;

    }
}