package src;

import java.util.Arrays;

public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;
        Arrays.fill(dp, 1);
        for(int i=0;i<n;i++){
        	for(int j=0;j<=i;j++){
        		if(nums[j]<nums[i]&&dp[i]<dp[j]+1)
        			dp[i] = dp[j] + 1;
        		
        	}
        	max = Math.max(dp[i], max);
        }
        if(max>=3)
        	return true;
        return false;
    }
}
