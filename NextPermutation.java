package src;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		if(nums.length<=1)
			return;
		int i=nums.length-1;
		for(;i>0;i--){
			if(nums[i]>nums[i-1])
				break;
		}
		if(i==0)
			for(int k=0;k<nums.length/2;k++){
				swap(nums,k,nums.length-1-k);
			}
		else{
			int ii = i;
			i--;
			for(int j=nums.length-1;j>i;j--){
				if(nums[j]>nums[i]){
					swap(nums,j,i);
					break;
				}
					
			}
			 for(int k=0;k<(nums.length-ii)/2;k++)  
             {  
                 swap(nums, ii+k, nums.length-1-k);  
             }  
		}
    }

	private void swap(int[] nums, int k, int i) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[k];
		nums[k] = temp;
	}
}
