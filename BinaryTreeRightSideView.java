import java.util.ArrayList;
import java.util.List;


public class BinaryTreeRightSideView {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        view(res,root,0);
        return res;
    }
	private void view(List<Integer> res, TreeNode root, int depth) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		if(depth == res.size())
			res.add(root.val);
		view(res,root.right,depth+1);
		view(res,root.left,depth+1);
	}
}
