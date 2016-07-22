import java.util.ArrayList;
import java.util.List;


public class PathSumII {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if(root == null) return result;
	        
	        helper(root,sum, result, new ArrayList<Integer>());
	        return result;
	    }
	    
	    private void helper(TreeNode root, int sum, List<List<Integer>> result, List<Integer> list){
	        if(root == null) return;
	        if(root.left == null && root.right == null){
	            if(sum == root.val){
	                
	                List<Integer> temp = new ArrayList<Integer>(list);
	                temp.add(root.val);
	                result.add(temp);
	            }
	            return;
	        }
	        
	        list.add(root.val);
	        helper(root.left, sum-root.val, result,list );
	        helper(root.right,sum-root.val,result,list);
	        list.remove(list.size()-1);
	    }
}
