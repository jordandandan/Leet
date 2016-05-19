import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SingleNumberII {

	/*
	 * hashmap solution
	 */
	 public int singleNumber(int[] nums) {
	        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	        int count;
	        for(int x: nums){
	        	if(map.containsKey(x))
	        	{
	        		count = map.get(x);
	        		count++;
	        		map.put(x,count);
	        	}
	        	else
	        		map.put(x, 0);
	        }
	       Set set = map.keySet();
	      
	       Iterator it = set.iterator();
	       int num = 0;
	       while(it.hasNext()){
	    	   num = (Integer)it.next();
	    	   if(map.get(num)==1){
	    		   break;
	    	   }
	       }
	       return num;
	    }
	 /*
	  * bit manipulation
	  */
	 public int singleNumber1(int[] nums){
		 	if(nums==null||nums.length==0)
		 		return 0;
		 	int[] a = new int[32];
		 	for(int i=0;i<nums.length;i++)
		 		for(int j=0;j<32;j++){
		 			if((nums[i]&(1<<j))!=0)
		 				a[j] = (a[j] + 1)%3;//the only one time number a[j] = 1
		 		}
		 	int result = 0;
		 	for(int j=0;j<32;j++){
		 		if(a[j]>0)
		 			result |= (1<<j);
		 	}
		 	return result;
	 }
}
