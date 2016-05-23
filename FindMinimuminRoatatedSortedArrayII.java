package src;

public class FindMinimuminRoatatedSortedArrayII {
	 public int findMin(int[] nums) {
	        int l = 0;
	        int r = nums.length-1;
	        int mid;
	        while(l<r&&nums[l]>=nums[r]){
	        	mid = (l+r)/2;
	        	if(nums[mid]>nums[r])
	        		l = mid + 1;
	        	else if(nums[mid]<nums[l])
	        		r = mid;
	        	else//nums[l] == nums[m] == nums[r] e.g [1,0,1,1,1] or [1,1,1,0,1]
	        		l = l+1;
	        }
	        return nums[l];
	    }
}
