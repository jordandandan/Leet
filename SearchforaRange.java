
public class SearchforaRange {
	public int[] searchRange(int[] nums, int target) {
		 int[] res = new int[]{-1,-1};
			int low = 0;
			int high = nums.length-1;
			while(nums[low]<nums[high]){
				int mid = low + (high-low)/2;
				if(nums[mid]>target)
					high = mid - 1;
				else if(nums[mid]<target)
					low = mid + 1;
				else{
					if(nums[low] == target)
						high--;
					else
						low++;
				}
			}
			if(nums[low]==target&&nums[high]==target){
				res[0] = low;
				res[1] = high;
			}
			return res;
    }
}
