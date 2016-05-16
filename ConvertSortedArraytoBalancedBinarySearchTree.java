
public class ConvertSortedArraytoBalancedBinarySearchTree {
	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(0,nums.length-1,nums);
    } 
	public TreeNode sortedArrayToBST(int start,int end,int[] nums){
		if(start>end)
			return null;
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(start,mid-1,nums);
		node.right = sortedArrayToBST(mid+1,end,nums);
		return node;
	}
}
