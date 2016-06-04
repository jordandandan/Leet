package src;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int oldIndex;
		int newIndex = 0;
		for(oldIndex=0;oldIndex<nums.length;oldIndex++){
			if(nums[oldIndex]!=val){
				nums[newIndex++] = nums[oldIndex];
			}
		}
		return newIndex;
    }
}
