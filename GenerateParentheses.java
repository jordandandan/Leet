package src;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	 public List<String> generateParenthesis(int n) {
	        String s = "";
	        List<String> list = new ArrayList<String>();
		 	helper(n,n,s,list);
		 	return list;
	    }

	private void helper(int left, int right, String s, List<String> list) {
		// TODO Auto-generated method stub
		if(left==0&&right==0)
			list.add(s);
		if(left>0)
			helper(left-1, right, s+"(", list);
		if(right>0&&left<right)
			helper(left, right-1, s+")", list);
	}
}
