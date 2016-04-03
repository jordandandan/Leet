package src;

import java.util.HashMap;
import java.util.Map;

public class TowSum_1 {
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    int[] ret = new int[2];
	    for (int i = 0; i< nums.length; i++) {
	        if (map.containsKey(target-nums[i])) {
	            ret[0] = map.get(target-nums[i]);
	            ret[1] = i;
	            break;
	        }
	        map.put(nums[i], i);
	    }
	    return ret;
	}
}
