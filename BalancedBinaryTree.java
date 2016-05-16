


public class BalancedBinaryTree {
	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public boolean isBalanced(TreeNode root) {
		 if(root==null)
			 return true;
	        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1&&
	        		isBalanced(root.left)&&isBalanced(root.right);
	    }
	 public int maxDepth(TreeNode root) {
	        if(root != null){
	        	return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
	        }
	        else 
	        	return 0;
	    }
}
