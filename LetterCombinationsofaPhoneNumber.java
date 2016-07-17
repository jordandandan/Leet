import java.util.ArrayList;
import java.util.List;


public class LetterCombinationsofaPhoneNumber {
	public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length()==0){
        	return res;
        }
        String temp = "";
        String[] letter = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int start = digits.charAt(0)-'2';
        int l = digits.length();
        int index = 0;
        backTracking(res,temp,letter,l,start,index,digits);
        return res;
    }

	private void backTracking(List<String> res, String temp, String[] letter,
			int l, int start, int index,String digits) {
		// TODO Auto-generated method stub
		if(l==0){
			String t = new String(temp);
			res.add(t);
			return;
		}
		for(int i=0;i<letter[start].length();i++){
			temp += letter[start].charAt(i);
			int old = start;
			if(index<digits.length()-1){
				start = digits.charAt(index+1) - '2';
			}
			backTracking(res, temp, letter, l-1, start, index+1, digits);
			temp = temp.substring(0,temp.length()-1);
			start = old;
		}
	}
}	
