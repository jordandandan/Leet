
public class ConstructBinaryTreefromInorderandPostorderTraversal {
	private int preStart = 0;
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
	        if(preorder.length==0)
	        	return null;
	        return construct(preorder,inorder,0,inorder.length-1);
	    }
	private TreeNode construct(int[] preorder, int[] inorder, int inStart, int inEnd) {
		// TODO Auto-generated method stub
		if(inStart>inEnd||preStart>preorder.length-1)
			return null;
		TreeNode root = new TreeNode(preorder[preStart++]);
		int index = -1;
		for(int i=inStart;i<=inEnd;i++){
			if(inorder[i]==root.val){
				index = i;
				break;
			}
				
		}
		root.left = index==-1?null:construct(preorder, inorder, inStart, index-1);
		root.right = index==-1?null:construct(preorder, inorder, index+1, inEnd);
		return root;
	}
}
