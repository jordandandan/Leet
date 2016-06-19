package src;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
        String[] s = str.trim().split(" ");
        if(pattern.length()!=s.length)
        	return false;
        Map<String,Integer> map_s = new HashMap<String, Integer>();
        Map<Character,Integer> map_p = new HashMap<Character, Integer>();
        for(Integer i=0;i<s.length;i++){
        	if(map_s.put(s[i], i)!=map_p.put(pattern.charAt(i), i))
        		return false;
        }
        return true;
    }
}
