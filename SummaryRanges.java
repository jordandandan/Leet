import java.util.ArrayList;
import java.util.List;


public class SummaryRanges {	
	public List<String> summaryRanges(int[] nums) {
		 List<String> res = new ArrayList<String>();
	        
			if(nums.length==0)
	        	return res;
			int begin = 0,end = 0;
			int n = nums.length;
			while(end<n){
				end++;
				while(end<n&&nums[end-1]+1==nums[end]){
					end++;
				}
				int count = end - begin;
				if(count>1){
					res.add(String.valueOf(nums[begin])+"->"+String.valueOf(nums[end-1]));
				}else{
					res.add(String.valueOf(nums[begin]));
				}
				begin = end;
			}
			return res;
    }
}
