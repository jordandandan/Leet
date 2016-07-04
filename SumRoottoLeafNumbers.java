package src;

import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public int sumNumbers(TreeNode root) {
	        List<Integer> list = new ArrayList<Integer>();
	        if(root==null)
	        	list.add(0);
	        else
	        	sum(root,0,list);
	        int res = 0;
	        for(Integer i : list)
	        	res += i;
	        return res;
	    }
	private void sum(TreeNode root, int temp, List<Integer> list) {
		// TODO Auto-generated method stub
		temp = temp*10 + root.val;
		if(root.left==null&&root.right==null){
			list.add(temp);
			return;
		}

		if(root.left!=null)
			sum(root.left,temp,list);
		if(root.right!=null)
			sum(root.right, temp, list);
	}
}
