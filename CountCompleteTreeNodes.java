
public class CountCompleteTreeNodes {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public int countNodes(TreeNode root) {
		if(root == null)
			return 0;
        int hLeft = height(root.left);
        int hRight = height(root.right);
        if(hLeft == hRight)
        	return (1<<hLeft) + countNodes(root.right);// 2^h
        else
        	return (1<<hRight) + countNodes(root.left);// it must be hRight < hLeft
    }
	private int height(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
		    return 0;
		return 1 + height(root.left);
	}
}
