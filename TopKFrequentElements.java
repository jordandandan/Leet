import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;


public class TopKFrequentElements {
	 public static List<Integer> topKFrequent(int[] nums, int k) {
		 	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		 	for(int i=0;i<nums.length;i++){
		 		if(map.containsKey(nums[i])){
		 			map.put(nums[i], map.get(nums[i])+1);
		 		}
		 		else
		 			map.put(nums[i], 1);
		 	}
		 	Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		 	Comparator<Entry<Integer, Integer>> cmp = new Comparator<Entry<Integer, Integer>>() {
				
				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getValue()-o1.getValue();
				}
			};
			PriorityQueue<Entry<Integer,Integer>> q = new PriorityQueue<Entry<Integer,Integer>>(map.size(),cmp);
			for(Entry<Integer,Integer> entry:entrySet){
				q.add(entry);
			}
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<k;i++){
				list.add(q.poll().getKey());
			}
			return list;
	    }
	 @Test
	 public void test(){
		 int[] nums = {1,1,1,2,2,3};
		 List<Integer> list = topKFrequent(nums, 2);
		 for(Integer i:list){
			 System.out.print(i+";");
		 }
	 }
}
