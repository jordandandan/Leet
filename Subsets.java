package src;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>>	res = new ArrayList<List<Integer>>();
		collection(list,res,0,nums);
		return res;
    }

	private void collection(List<Integer> list, List<List<Integer>> res, int start,
			int[] nums) {
		// TODO Auto-generated method stub
		res.add(new ArrayList<Integer>(list));
		for(int i=start;i<nums.length;i++){
			list.add(nums[i]);
			collection(list, res, start+1, nums);
			list.remove(list.size()-1);
		}
	}
	@Test
	public void test(){
		int[] nums = {1,2,3};
		subsets(nums);
	}
}
