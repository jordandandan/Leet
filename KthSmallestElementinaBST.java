package src;

import java.util.Stack;

public class KthSmallestElementinaBST {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 //iterative soluiton
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(root!=null||!stack.isEmpty()){
			while(root!=null){
				stack.push(root);
				root = root.left;
			}
			if(!stack.isEmpty()){
				root = stack.pop();
				if(--k==0)
					break;
				root = root.right;
			}
			
			
		}
        return root.val;
    }
	//recursive solution
	/*
	 * size of left + 1 = k :return current
	 * size of left　> k :in the left
	 * else in the right 
	 */
	public int kthSmallest1(TreeNode root, int k) {
		int leftSize = getSize(root);
		if(leftSize+1==k)
			return root.val;
		else if(leftSize>k)
			return kthSmallest(root.left, k);
		else
			return kthSmallest(root.right, k);
    }
	public int getSize(TreeNode root){
		if(root==null)
			return 0;
		return 1 +  getSize(root.left) + getSize(root.right);
	}
}
