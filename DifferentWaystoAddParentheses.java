import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DifferentWaystoAddParentheses {
	 public List<Integer> diffWaysToCompute(String input) {
	        Map<String,List<Integer>> cache = new HashMap<String, List<Integer>>();//using cache to memorize the repeated subString
	        List<Integer> res = findWays(input,cache);
	        return res;
	    }

	private List<Integer> findWays(String input,
			Map<String, List<Integer>> cache) {
		// TODO Auto-generated method stub
		if(cache.containsKey(input))
			return cache.get(input);
		boolean expression = false;
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<input.length();i++){
			if("+-*".indexOf(input.charAt(i))!=-1){
				List<Integer> left= findWays(input.substring(0,i), cache);//the cal result at the left of the operator
				List<Integer> right = findWays(input.substring(i+1), cache);
				for(Integer l : left)
					for(Integer r : right)
						res.add(cal(l,r,input.charAt(i)));
				expression = true;
			}
			
		}
		if(!expression){
			res.add(Integer.parseInt(input));
		}
		cache.put(input, res);
		return res;
	}

	private Integer cal(Integer l, Integer r, char op) {
		// TODO Auto-generated method stub
		int res = 0;
		switch (op) {
		case '+': res = l + r;break;
		case '-': res = l - r;break;
		case '*': res = l * r;break;
		default:
			break;
		}
		return res;
	}
}
