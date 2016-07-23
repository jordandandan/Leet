import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates.length==0)
        	return res;
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        int start = 0;
        backTracking(res,temp,start,target,candidates);
        return res;
    }

	private void backTracking(List<List<Integer>> res, List<Integer> temp,
			int start, int target, int[] candidates) {
		// TODO Auto-generated method stub
		if(target==0){
			List<Integer> newList = new ArrayList<Integer>(temp);
			res.add(newList);
			return;
		}
		for(int i=start;i<candidates.length;i++){
			if(candidates[i]>target){
				break;
			}
			if(i>start&&candidates[i]==candidates[i-1])
				continue;
			temp.add(candidates[i]);
			backTracking(res, temp, i+1, target-candidates[i], candidates);
			temp.remove(temp.size()-1);
		}
	}
}
