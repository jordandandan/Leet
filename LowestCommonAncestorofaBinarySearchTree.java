
public class LowestCommonAncestorofaBinarySearchTree {
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==null||q==null||root==null)
        	return null;
        if(p.val==root.val||q.val==root.val)
        	return root;
        if(Math.max(p.val, q.val)<root.val)
        	return lowestCommonAncestor(root.left, p, q);
        if(Math.min(p.val, q.val)>root.val)
        	return lowestCommonAncestor(root.right, p, q);
        return root;
	}
}
