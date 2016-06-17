import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;


public class BinaryTreePreorderTraversal {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	private List<Integer> res = new ArrayList<Integer>();
	//recursive Solution
	public List<Integer> preorderTraversal(TreeNode root) {
        preVisit(root);
        return res;
    }
	private void preVisit(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
	}
	//iteratively solution
	public List<Integer> preorderTraversal1(TreeNode root){
		 Stack<TreeNode> stack = new Stack<TreeNode>();
			if(root == null)
				return res;
			stack.push(root);
			while(!stack.isEmpty()){
				TreeNode temp = stack.pop();
				res.add(temp.val);
				if(temp.right!=null)
					stack.push(temp.right);
				if(temp.left!=null)
					stack.push(temp.left);
				
			}
			return res;
		
		
		
	}

}
