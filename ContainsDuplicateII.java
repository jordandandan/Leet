import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ContainsDuplicateII {
	//map solution 
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		    for (int i = 0; i < nums.length; i++) {
		        if (map.containsKey(nums[i])) {
		            if (i - map.get(nums[i]) <= k) return true;
		        }
		        map.put(nums[i], i);
		    }
		    return false;
	    }
	 //Set solution
	 public boolean containsNearbyDuplicate1(int[] nums, int k) {
	        Set<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(i > k) set.remove(nums[i-k-1]);
	            if(!set.add(nums[i])) return true;
	        }
	        return false;
	 }
}
