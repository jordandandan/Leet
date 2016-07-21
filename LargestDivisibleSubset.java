import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LargestDivisibleSubset {
	public List<Integer> largestDivisibleSubset(int[] nums) {
		 List<Integer> res = new ArrayList<Integer>();
	        if(nums.length==0)
	        	return res;
	        
	        int maxIndex = 0;//default the first element
	        int max = Integer.MIN_VALUE;
	        int[] dp = new int[nums.length];//the subset elements number
	        int[] prev = new int[nums.length];// array for backtracking
	        Arrays.sort(nums);
	        Arrays.fill(dp, 1);
	        for(int i=0;i<prev.length-1;i++){
	        	prev[i] = i;
	        }
	        for(int i=1;i<nums.length;i++){
	        	for(int j=0;j<i;j++){
	        		if((nums[i]%nums[j]==0)||(nums[j]%nums[i]==0)){
	        			dp[i] = Math.max(dp[j]+1, dp[i]);
	        			if(dp[i] == dp[j]+1)
	        				prev[i] = j;
	        		}
	        	}
	        	max = Math.max(max, dp[i]);
	        	maxIndex = max==dp[i]?i:maxIndex;
	        }
	        int count = dp[maxIndex];
	        
	        while(count>0){
	        	res.add(nums[maxIndex]);
	        	maxIndex = prev[maxIndex];//backtracking
	        	count--;
	        }
	        return res;
    }
}
