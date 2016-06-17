package src;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		return pathSum(root,0,sum);
    }

	private boolean pathSum(TreeNode root, int i, int sum) {
		// TODO Auto-generated method stub
		if(root==null)
		    return false;
		if(root.left==null&&root.right==null)
			return sum == (root.val + i);
		return pathSum(root.left,root.val+i,sum)||pathSum(root.right,root.val+i,sum);
	}
}
