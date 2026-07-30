class PathSum{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;
        else if(root.left==null&&root.right==null)
        return root.val==targetSum;
        else
        return hasPathSum(root.left,targetSum - root.val)||hasPathSum(root.right,targetSum-root.val);
    }
}
