package src;

public class MajorityElement {
	 public int majorityElement(int[] nums) {
	        int len = nums.length;
	        int res = 0;
	        for(int i=0;i<32;i++){
	        	int one = 0,zero =0;
	        	for(int j=0;j<len;j++){
	        		if((nums[j]&(1<<i))!=0)
	        			one++;
	        		else
	        			zero++;
	        			
	        	}
	        	if(zero<one)
	        		res |= (1<<i);
	        }
	        return res;
	    }
}
