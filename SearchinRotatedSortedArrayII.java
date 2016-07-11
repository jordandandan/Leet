
public class SearchinRotatedSortedArrayII {
	  public boolean search(int[] nums, int target) {
	        return helper(nums, target, 0, nums.length-1);
	    }
	    private boolean helper(int[] nums, int target, int left, int right) {
	        if (left > right) return false;
	        int mid = (left+right)/2;
	        if (nums[mid] == target) return true;
	        else return helper(nums, target, left, mid-1) || helper(nums, target, mid+1, right);
	    }
}	
