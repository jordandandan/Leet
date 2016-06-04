package src;

public class SingleNumberIII {
	 public int[] singleNumber(int[] nums) {
	        int x = 0;
	        int[] res = new int[2];
		 	for(int i=0;i<nums.length;i++){
	        	x ^= nums[i];
	        }
		 	x &= -x;//find the lowest bit 1
		 	for(int i=0;i<nums.length;i++){
		 		//divide into 2 categories: the lowest bit 1 or 0
		 		if((x&nums[i])!=0){
		 			res[0] ^= nums[i];
		 		}else{
		 			res[1] ^= nums[i];
		 		}
		 	}
		 	return res;
	    }
}
