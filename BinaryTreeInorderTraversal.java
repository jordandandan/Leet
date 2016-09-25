import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import BinaryTreePreorderTraversal.TreeNode;




public class BinaryTreeInorderTraversal {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	private List<Integer> res = new ArrayList<Integer>();
	//recursive solution
	 public List<Integer> inorderTraversal(TreeNode root) {
	        if(root==null)
	        	return res;
	        inVisit(root);
	    }
	 private void inVisit(TreeNode root) {
			// TODO Auto-generated method stub
			if(root==null)
				return;
	       
	        inVisit(root.left);
	        res.add(root.val);
	        inVisit(root.right);
		}
	 //iterative solution
	 public List<Integer> inorderTraversal1(TreeNode root) {
	       Stack<TreeNode> stack = new Stack<TreeNode>();
	       while(root!=null||!stack.isEmpty()){
	    	   while(root!=null){
	    		   stack.push(root);
	    		   root = root.left;
	    	   }
	    	   if(!stack.isEmpty()){
	    		   root = stack.pop();
	    		   res.add(root.val);
	    		   root = root.right;
			   if(root!=null)
				   break;
	    	   }
	       }
	       return res;
	    }
}
