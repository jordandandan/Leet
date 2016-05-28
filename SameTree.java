package src;

public class SameTree {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		     TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public boolean isSameTree(TreeNode p, TreeNode q) {
		 	boolean res = false,left =false,right=false;
		 	if((p==null && q==null)){
		 		res =  true;
		 		left = true;
		 		right = true;
		 	}
		 		
		 	else if(p==null&&q!=null||p!=null&&q==null){
		 		res =  false;
		 	}else if(p.val==q.val)
		 		res =  true;
		 	else
		 		res =  false;
		 	if(res&&p!=null&&q!=null){
		 		
		 			left = isSameTree(p.left, q.left);

		 			right = isSameTree(p.right,q.right);

		 	}
		 	
		 	return res&&left&&right;
	    }
}
