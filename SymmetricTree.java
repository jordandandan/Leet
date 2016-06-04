package src;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	//recursive solution
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
	//iterative solution
	public boolean isSymmetric2(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> left = new LinkedList<TreeNode>();
        Queue<TreeNode> right = new LinkedList<TreeNode>();
        left.add(root.left);
        right.add(root.right);
        while(!left.isEmpty() && !right.isEmpty()) {
            TreeNode l = left.poll();
            TreeNode r = right.poll();

            if (l == null && r == null)
                continue;
            if (l == null || r == null)
                return false;

            if (l.val != r.val)
                return false;

            left.add(l.left);
            right.add(r.right);

            left.add(l.right);
            right.add(r.left);
        }

        if (left.isEmpty() && right.isEmpty())
            return true;
        else 
            return false;
    }
}
