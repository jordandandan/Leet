
public class MaximumProductSubarray {
	 public int maxProduct(int[] nums) {
	        int n = nums.length;
	        if(n==1)
	        	return nums[0];
	        else if(n==0)
	        	return 0;
	        int[] dp_max = new int[n];
	        int[] dp_min = new int[n];
	        int max = nums[0];
	        dp_max[0] = nums[0];
	        dp_min[0] = nums[0];
	        for(int i=1;i<n;i++){
	        	dp_max[i] = Math.max(nums[i],Math.max(nums[i]*dp_min[i-1], nums[i]*dp_max[i-1]));
	        	dp_min[i] = Math.min(nums[i], Math.min(nums[i]*dp_max[i-1], nums[i]*dp_min[i-1]));//it is possible that the negative product negative number
	        	max = Math.max(max, dp_max[i]);
	        }
	        return max;
	    }
}
