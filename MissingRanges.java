import java.util.ArrayList;
import java.util.List;


public class MissingRanges {
	 public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
		 
		 List<String> ranges = new ArrayList<String>();
		 int next = lower;
		 boolean flag = true;
		 boolean find = false;
		 if(lower==upper){
			 for(int i=0;i<nums.length;i++){
				 if(nums[i] == lower)
					 find = true;
			 }
			 if(find)
				 return ranges;
			 else{
				 ranges.add(getRange(lower, upper));
				 return ranges;
			 }
				 
		 }
		
		 for(int i=0;i<nums.length;i++){
			 if(next>nums[i])
				 continue;
			 if(next==nums[i]){
				 next++;
				 continue;
			 }
			 if(nums[i]<=upper){
				 if(nums[i] == upper){
					 ranges.add(getRange(next,nums[i]-1));
					 
				 }else
					 ranges.add(getRange(next,upper));
				 flag = false;
				 break;
			 }
			 ranges.add(getRange(next,nums[i]-1));
			 next = nums[i] + 1;
		 }
	        if(flag&&next<=upper)
	        	ranges.add(getRange(next,upper));
	        return ranges;
	    }
	 public  static String getRange(int from,int to){
		 return from==to?String.valueOf(from):String.valueOf(from)+"->"+String.valueOf(to); 
	 }
	 public static void main(String[] args) {
		int nums[] = {0,1};
		int low = 0;
		int up = 1;
		System.out.println(findMissingRanges(nums, low, up).toString());
	}
}
