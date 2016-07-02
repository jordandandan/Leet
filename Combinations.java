package src;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Combinations {
	 public List<List<Integer>> combine(int n, int k) {
		 	
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        List<Integer> temp = new ArrayList<Integer>();
	        int index = 1;
	        combination(res,temp,index,n,k);
	        return res;
	    }

	private void combination(List<List<Integer>> res, List<Integer> temp,
			int index, int n, int k) {
		// TODO Auto-generated method stub
		if(k==0){
			List<Integer> list = new ArrayList<Integer>(temp);
			res.add(list);
			return;
		}
		for(int i=index;i<=n;i++){
			temp.add(i);
			combination(res, temp, i+1, n, k-1);
			temp.remove(temp.size()-1);
		}
	}
	@Test
	public void test(){
		combine(4,2);
	}
}
