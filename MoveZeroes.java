package src;

public class MoveZeroes {
	  public void moveZeroes(int[] nums) {
	       int index = 0;
	       int len = nums.length;
	       
	       for(int num:nums){
	    	   if(num!=0){
	    		 nums[index++] = num;  
	    	   }
	       }
	       while(index<len){
	    	   nums[index++] = 0;
	       }
	    }
}
