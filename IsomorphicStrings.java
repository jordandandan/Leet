import java.util.HashSet;
import java.util.Set;


public class IsomorphicStrings {
	 public boolean isIsomorphic(String s, String t) {
		 if(s==null&&t==null)
			 return true;
		 int[] pos_s = new int[26];
		 int[] pos_t = new int[26];
		 for(int i=0;i<s.length();i++){
			 if(pos_s[s.charAt(i)-'a']!=pos_t[t.charAt(i)-'a'])
				 return false;
			 pos_s[s.charAt(i)-'a'] = pos_t[t.charAt(i)-'a'] = i+1;//intial val is 0£¡
		 }
		 return true;
	  }
}
