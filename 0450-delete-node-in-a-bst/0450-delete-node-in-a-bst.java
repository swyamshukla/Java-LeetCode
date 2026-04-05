class Solution {


   static void delete(TreeNode root,int val){
        if(root==null) return;

        if(root.val<val){
                // go right
            if(root.right!=null && root.right.val==val){
                // zero child
                if(root.right.left==null && root.right.right==null){
                    root.right=null;
                    return;
                }
                // 1 child
                else if(root.right.left==null || root.right.right==null){
                    if(root.right.left==null){
                        root.right=root.right.right;
                    }
                    else{
                        root.right=root.right.left;
                    }
                    return;
                }
                // 2 child
                else{
                    TreeNode temp = root.right.left;
                    while(temp.right!=null){
                        temp=temp.right;
                    }
                    int val2 = temp.val;
                    delete(root.right, val2);
                    root.right.val = val2;
                    return;
                }
            }
            delete(root.right,val);
        }
        if(root.val>val){
            if(root.left!=null && root.left.val==val){
            // zero child
            if(root.left.left==null && root.left.right==null){
                root.left=null;
                return;
            }
            // 1 child
            else if(root.left.left==null || root.left.right==null){
                    if(root.left.left==null){
                        root.left=root.left.right;
                    }
                    else{
                        root.left=root.left.left;
                    }
                    return;
            }
            else{
                TreeNode temp = root.left.left;
                    while(temp.right!=null){
                        temp=temp.right;
                    }
                    int val2 = temp.val;
                    delete(root.left, val2);
                    root.left.val = val2;
                    return;
            }
        }   
            delete(root.left,val);
    }
}



public TreeNode deleteNode(TreeNode root, int key) {
    if (root != null && root.val == key) {
        TreeNode dummy = new TreeNode(key + 1); // always > key, so goes left
        dummy.left = root;
        delete(dummy, key);
        return dummy.left;
    }
    delete(root, key);
    return root;
}}
