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

    public static void recursion(TreeNode root, int[] arr, int level) {
        if (root == null)
            return;

        arr[level-1] = root.val;
  

        recursion(root.left, arr, level + 1);
        recursion(root.right, arr, level + 1);

    }

    public static int depth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 +Math.max(depth(root.left), depth(root.right));
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        int level = depth(root);

      int[] arr = new int[level];


        recursion(root, arr, 1);
        for (int i = 0; i < level; i++) {
            result.add(arr[i]); // fill with 0 (or any value)
        }
        return result;

    }
}