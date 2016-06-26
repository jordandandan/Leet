import java.util.ArrayList;
import java.util.List;


public class CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		combinationSum(res,temp,3,1,n);
		return res;
    }

	private void combinationSum(List<List<Integer>> res, List<Integer> temp,
			int k, int start, int target) {
		// TODO Auto-generated method stub
		if(temp.size()==3&&target==0){
			List<Integer> copy = new ArrayList<Integer>(temp);
			res.add(copy);
			return;
		}
		for(int i=start;i<=9;i++){
				temp.add(i);
				combinationSum(res, temp, k, i+1, target-i);
				temp.remove(temp.size()-1);
			
		}
	}
}
