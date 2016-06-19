package src;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        
    	s = s.trim();
    	if(s.length()==0)
    		return 0;
    	String[] temp = s.split(" ");
    	return temp[temp.length-1].length();
        
    }
}
