package src;

public class HouseRobberIII {
	//recursive solution
	public int rob(TreeNode root) {
        if(root == null)
        	return 0;
        return Math.max(robInclude(root), robExclude(root));
    }

	private int robExclude(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return 0;
		return rob(root.left)+rob(root.right);// pay attention!
	}

	private int robInclude(TreeNode root) {
		// TODO Auto-generated method stub
		if(root ==null)
			return 0;
		return robExclude(root.left)+robExclude(root.right)+root.val;
	}
	//iterative solution
	public int rob1(TreeNode root){
		int[] num = dfs(root);
		return Math.max(num[0], num[1]);
	}

	private int[] dfs(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return new int[2];
		int[] left = dfs(root.left);
		int[] right = dfs(root.right);
		int[] res = new int[2];
		res[0] = left[1] + right[1] + root.val;
		res[1] = Math.max(left[0] , left[1]) + Math.max(right[0], right[1]);
		return res;
	}
}
