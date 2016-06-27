import java.util.Stack;


public class BinarySearchTreeIterator {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	Stack<TreeNode> stack = new Stack<TreeNode>();
	 public BinarySearchTreeIterator(TreeNode root) {
		// TODO Auto-generated constructor stub
		while(root!=null){
			stack.push(root);
			root = root.left;
		}
	}

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
    	TreeNode temp = stack.pop();
    	int res = temp.val;
    	temp = temp.right;
    	if(temp!=null)
    	    stack.push(temp);
    	while(temp!=null&&temp.left!=null){
    		temp = temp.left;
    		stack.push(temp);
    	}

	
    	return res;
    }
}
