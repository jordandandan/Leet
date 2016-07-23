import java.util.ArrayList;
import java.util.List;


public class PalindromePartitioning {
	  public List<List<String>> partition(String s) {
	        List<List<String>> res = new ArrayList<List<String>>();
	        if(s.length()==0)
	        	return res;
	        List<String> temp = new ArrayList<String>();
	        int start = 0;
	        backTracking(res,temp,start,s);
	        return res;
	    }

	private void backTracking(List<List<String>> res, List<String> temp,
			int start, String s) {
		// TODO Auto-generated method stub
		if(start == s.length()){
			res.add(temp);
			return;
		}
		for(int i=start+1;i<=s.length();i++){
			if(isPalindrom(s.substring(start, i))){
				List<String> newTemp = new ArrayList<String>(temp);
				newTemp.add(s.substring(start, i));
				backTracking(res, newTemp, i, s);
			}
		}
	}

	private boolean isPalindrom(String substring) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = substring.length()-1;
		for(;i<=j;i++,j--){
			if(substring.charAt(i)!=substring.charAt(j))
				return false;
		}
		return true;
	}
}
