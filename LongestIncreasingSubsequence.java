import java.util.Arrays;


public class LongestIncreasingSubsequence {
	 public int lengthOfLIS(int[] nums) {
		   if(nums.length==0)
			   return 0;
		   else if(nums.length==1)
			   return 1;
		   int len = nums.length;
	       int[] dp = new int[len+1];
	       int max = 1;
	       Arrays.fill(dp, 1);
	       for(int i=0;i<len;i++)
	    	   for(int j=0;j<=i;j++){
	    		   if(nums[j]<nums[i]&&dp[i]<dp[j]+1){
	    			   dp[i] = dp[j]+1;
	    			   if(dp[i]>=max)
	    				   max = dp[i];
	    		   }
	    		   
	    	   }
	       return max;
	    }
}
