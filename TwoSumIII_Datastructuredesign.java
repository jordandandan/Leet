package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TwoSumIII_Datastructuredesign {
	// Add the number to an internal data structure.
	List<Integer> list = new ArrayList<Integer>();
	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	public void add(int number) {
		list.add(number);
		if(map.containsKey(number))
			map.put(number, map.get(number)+1);
		else
			map.put(number,1);
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
	    for(int i:list){
	    	map.put(i, map.get(i)-1);

	    	if(map.containsKey(value-i)&&map.get(value-i)!=0){
	    		map.put(i, map.get(i)+1);
	    		return true;
		    	
	    	}
	    		
	    	map.put(i, map.get(i)+1);
	    	
	    }
	    return false;
	}

}
