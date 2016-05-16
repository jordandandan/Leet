package src;

public class ValidBinarySearchTree {
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	/*
	 * Solution 1 O(n2)
	 */
	 public boolean isValidBST(TreeNode root) {
	     boolean rootl = false,rootr = false;
	     boolean rootlc = false,rootrc = false;
		 if(root == null){
	    	  return true;
	      }
	      if((root.left!=null&&root.val>root.left.val)||root.left==null)
	    	  rootl = true;
	      if((root.right!=null&&root.val<root.right.val)||root.right==null)
	    	  rootr = true;
	      rootlc = isValidBST(root.left);
	      rootrc = isValidBST(root.right);
	      return rootl&&rootr&&rootlc&&rootrc;
	    }
	 /*
	  * Solution 2 O(n)
	  */
	 public boolean isValidBst1(TreeNode root){
		 return valid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	 }
	 public boolean valid(TreeNode root,int low,int high){
		 if(root == null)
			 return true;
		 return root.val>low&&root.val<high&&valid(root.left,low,root.val)&&valid(root.right,root.val,high);
	 }
}
