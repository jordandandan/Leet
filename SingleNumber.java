import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SingleNumber {
	/*
	 * bit manipulation
	 */
	public int singleNumber(int[] nums) {
        int num = 0;
		for(int x : nums){
        	num ^= x;
        }
		return num;
    }	
	/*
	 * hashset
	 */
	public int singleNumber2(int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		int num = 0;
		if(nums.length == 1)
			return nums[0];
		for(int x: nums){
			if(set.contains(x)){
				set.remove(x);
			}else{
				set.add(x);
			}
			
		}
		num = set.iterator().next();
		return num;
	}
}
