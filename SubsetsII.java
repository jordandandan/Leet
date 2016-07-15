import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SubsetsII {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int start = 0;
        Arrays.sort(nums);
        backtracking(res,temp,start,nums);
        return res;
    }

	private void backtracking(List<List<Integer>> res, List<Integer> temp,
			int start, int[] nums) {
		// TODO Auto-generated method stub
		res.add(new ArrayList<Integer>(temp));
		for(int i=start;i<nums.length;i++){
			if(i>start&&nums[i]==nums[i-1])//skip the duplicate	
				continue;
			temp.add(nums[i]);
			backtracking(res, temp, i+1, nums);
			temp.remove(temp.size()-1);
		}
	}

}
