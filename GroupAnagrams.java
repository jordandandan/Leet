import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagrams {
public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
        	char[] c = str.toCharArray();
        	Arrays.sort(c);
        	String key = String.valueOf(c);
        	if(!map.containsKey(key))
        		map.put(key, new ArrayList<String>());
        	map.get(key).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
