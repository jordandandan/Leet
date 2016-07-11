import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combination(res,temp,0,target,candidates);
        return res;
    }

	private void combination(List<List<Integer>> res, List<Integer> temp,
			int start, int target, int[] candidates) {
		// TODO Auto-generated method stub
		if(target==0){
			List<Integer> copy = new ArrayList<Integer>(temp);
			res.add(copy);
			return;
		}
		for(int i=start;i<candidates.length;i++){
			if(candidates[i]>target)
				break;
			temp.add(candidates[i]);
			combination(res, temp, i, target-candidates[i], candidates);
			temp.remove(temp.size()-1);
		}
	}
}
