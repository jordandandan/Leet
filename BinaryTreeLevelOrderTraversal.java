package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null)
        	return res;
        queue.add(root);
        while(!queue.isEmpty()){
        	int levelSize = queue.size();
        	List<Integer> tmp = new ArrayList<Integer>();
        	for(int i=0;i<levelSize;i++){
        		if(queue.peek().left!=null)
        			queue.add(queue.peek().left);
        		if(queue.peek().right!=null)
        			queue.add(queue.peek().right);
        		tmp.add(queue.poll().val);
        	}
        	res.add(tmp);
        }
        return res;
    }
}
