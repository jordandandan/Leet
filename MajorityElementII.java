package src;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {// boyer-moor majority vote algorithm
	 public List<Integer> majorityElement(int[] nums) {
	        int counter1 = 0,counter2 = 0, maj1 = 0, maj2 = 0;
	        for(int i=0;i<nums.length;i++){
	        	if(maj1==nums[i]){
	        		counter1++;
	        	}else if(maj2 == nums[i])
	        		counter2++;
	        	else if(counter1==0){
	        		maj1 = nums[i];
	        		counter1 = 1;
	        	}else if(counter2==0){
	        		maj2 = nums[i];
	        		counter2 = 1;
	        	}else{
	        		counter1--;
	        		counter2--;
	        	}
	        }
	        counter1 = counter2 = 0;
	        for(int tmp : nums){
	        	if(tmp == maj1)
	        		counter1++;
	        	else if(tmp == maj2)
	        		counter2++;
	        }
	        List<Integer> res = new ArrayList<Integer>();
	        if(counter1>nums.length/3)
	        	res.add(maj1);
	        if(counter2>nums.length/3)
	        	res.add(maj2);
	        return res;
	    }
}
