import java.util.Arrays;


public class HouseRobberII {
	public int rob(int[] nums) {
		  if(nums.length==0)
	        	return 0;
	        	 if(nums.length==1)
	        	return nums[0];
	        int[] dp = new int[nums.length+1];
	        dp[0] = 0;
	        dp[1] = nums[0];
	        //1->n-1
	        for(int i =2;i<nums.length;i++){
	        	dp[i] = Math.max(dp[i-1],nums[i-1]+dp[i-2]);
	        }
	        int temp = dp[nums.length-1];
	        //2->n
	        Arrays.fill(dp, 0);
	        dp[1] = 0;
	        dp[2] = nums[1];
	        for(int i=3;i<=nums.length;i++){
	        	dp[i] = Math.max(dp[i-1],nums[i-1]+dp[i-2]);
	        }
	        return Math.max(temp, dp[nums.length]);
    }
}
