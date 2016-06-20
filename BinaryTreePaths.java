package src;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	  public List<String> binaryTreePaths(TreeNode root) {
	        List<String> res = new ArrayList<String>();
	       
	        if(root == null)
	        	return res;
	        String s = String.valueOf(root.val);
	        getPath(root,s,res);
	        return res;
	    }
	private	void getPath(TreeNode root, String s, List<String> res) {
		// TODO Auto-generated method stub
		if(root.left==null&&root.right==null){
			res.add(s);
		}
		if(root.left!=null)
			getPath(root.left,s+"->"+root.left.val,res);
		if(root.right!=null)
			getPath(root.right,s+"->"+root.right.val,res);
	}
}
