package src;

public class RangeSumQuery_Immutable {
	private int[] nums;
	public RangeSumQuery_Immutable(int[] nums) {
        for(int i=1;i<nums.length;i++){
        	nums[i]+= nums[i-1];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if(i==0)
        	return this.nums[j];
        return nums[j] - nums[i-1];
    }
}
