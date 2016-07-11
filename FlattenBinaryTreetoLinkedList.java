
public class FlattenBinaryTreetoLinkedList {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 /*
	  * PreOrder solution
	  */
	 private TreeNode curr = null;
	 public void flatten(TreeNode root) {
	        if(root==null)
	        	return;
	        TreeNode left = root.left;
	        TreeNode right = root.right;
	        root.left = null;
	        root.right = null;
	        if(curr == null){
	        	curr = root;
	        }else{
	        	curr.right = root;
	        	curr = curr.right;
	        }
	        flatten(left);
	        flatten(right);
	    }
	/*
	 * solution 2 :"real" postOrder
	 */
	private TreeNode prev = null;
	public void flatten1(TreeNode root){
		if(root==null)
			return;
		flatten1(root.right);
		flatten1(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
	}
}
