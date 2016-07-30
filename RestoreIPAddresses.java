import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class RestoreIPAddresses {
	 
	    public List<String> restoreIpAddresses(String s) {
	    	List<String> res = new ArrayList<String> ();
	        backtrack(s,0,"",4,res);
	        return res;
	    }
	    public void backtrack(String s, int index, String cur,int left,List<String> res){
	        if(index==s.length()&&left==0){
	            res.add(cur);return;
	        }
	        
	        if(!cur.equals("")) cur = cur+".";
	        
	        for(int i=index+1;i<=index+3&&i<=s.length();i++){
	            if(i>index+1&&s.charAt(index)=='0') break;
	            String sub = s.substring(index,i);
	            int value = Integer.parseInt(sub);
	            if(value>=0&&value<=255&&left>0){
	                backtrack(s,i,cur+sub,left-1,res);
	            }
	        }
	    }
	    @Test
	    public void test(){
	    	String s = "0000";
	    	List<String> res = restoreIpAddresses(s);
	    }
}
