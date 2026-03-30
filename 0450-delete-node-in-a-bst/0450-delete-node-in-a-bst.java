class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        // Step 1: Find the node
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } 
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } 
        else { // Node found

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            // 👉 Using successor (smallest in right subtree)
            TreeNode succ = root.right;
            while (succ.left != null) {
                succ = succ.left;
            }

            // Replace value
            root.val = succ.val;

            // Delete successor
            root.right = deleteNode(root.right, succ.val);
        }

        return root;
    }
}