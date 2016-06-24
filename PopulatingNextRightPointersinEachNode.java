import java.util.LinkedList;
import java.util.Queue;


public class PopulatingNextRightPointersinEachNode {
	 public class TreeLinkNode {
		      int val;
		      TreeLinkNode left, right, next;
		      TreeLinkNode(int x) { val = x; }
		  }
	 public void connect(TreeLinkNode root) {
	        if(root == null)
	        	return;
	        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
	        int node_num = 0;
	        queue.add(root);
	        node_num = queue.size();
	        while(!queue.isEmpty()){
	        	
	        	TreeLinkNode temp = queue.poll();
	        	node_num --;
	        	if(temp.left!=null)
	        		queue.add(temp.left);
	        	if(temp.right!=null)
	        		queue.add(temp.right);
	        	if(node_num == 0){
	        		temp.right = null;
	        		node_num = queue.size();
	        	}else
	        		temp.next = queue.peek();
	        	
	        }
	    }

}
