import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntersectionofTwoArrayII {
	public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer,Integer> map = new HashMap<Integer, Integer>();
       List<Integer> list = new ArrayList<Integer>();
       for(int num:nums1){
    	   if(!map.containsKey(num)){
    		   map.put(num, 1);
    		 
    	   }else
			   map.put(num,map.get(num)+1);
       }
       for(int num:nums2){
    	   if(map.containsKey(num)&&map.get(num)>0){
    		   list.add(num);
    		   map.put(num, map.get(num)-1);
    	   }
       }
       int[] result = new int[list.size()];
       int j = 0;
       for (int num : list) {
           result[j] = num;
           j++;
       }
       return result;
    }

}
