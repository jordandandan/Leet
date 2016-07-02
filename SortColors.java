package src;

public class SortColors {
	 public void sortColors(int[] nums) {
	        int zero =0;
	        int second = nums.length - 1;
	        for(int i=0;i<nums.length;i++){
	        while(nums[i]==2&&i<second){
	            int temp = nums[second];
	            nums[second] = nums[i];
	            nums[i] = temp;
	            second--;
	        }
	        while(nums[i]==0&&i>zero){
	            int temp = nums[zero];
	            nums[zero] = nums[i];
	            nums[i] = temp;
	            zero++;
	        }
	        }
	            
	    }
}
