
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums.length==1)
        	return nums.length;
        int head = 0;
        int res = 1;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]==nums[head])
        		continue;
        	else{
        		res++;
        		head++;
        		nums[head] = nums[i];
        		
        	}
        }
        return res;
    }
}
