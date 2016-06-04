package src;

public class SymmetricTree {
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public boolean isSymmetric(TreeNode root) {
        if(root == null)
        	return true;
        return check(root.left,root.right);
    }
	private boolean check(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if(left==null&&right==null)
			return true;
		if(left==null||right==null)
			return false;
		return left.val==right.val&&check(left.left,right.right)&&check(left.right,right.left);
	}
}
