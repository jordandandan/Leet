import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class IsomorphicStrings {
	//using array
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
	 //using map
	 public boolean isIsomorphic1(String s,String t){
		 Map<Character,Integer> map1 = new HashMap<Character, Integer>();
		 Map<Character,Integer> map2 = new HashMap<Character, Integer>();
		 for(Integer i=0;i<s.length();i++){//we should make a reference compare below,if we use int, then we make two different obj at the //same time
			 if(map1.put(s.charAt(i), i)!=(map2.put(t.charAt(i), i)))//the put method return the previous value of same key
				 return false;
		 }
		 return true;
	 }
}
