
public class JumpGame {
	 public boolean canJump(int[] nums) {
		 	if(nums.length<=1)
		 		return true;
	        int reachIndex = nums.length-1;
	        boolean res = false;
	        for(int i=nums.length-2;i>=0;i--){
	        	if(nums[i]+i>=reachIndex){
	        		reachIndex = i;
	        		res = true;
	        	}else
	        		res = false;
	        }
	        return res;
	    }
}
