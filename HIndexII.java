package src;

public class HIndexII {
	 public int hIndex(int[] citations) {
	        int start = 0;
	        int end = citations.length-1;
	        int len = citations.length;
	        int result = 0;
	        int mid;
	        while(start <= end){
	            mid = start + (end-start)/2;
	            if(citations[mid] >= (len - mid)){//eg. [100,100] should return 2 but not 1
	                result = (len-mid);
	                end = mid-1;
	            }
	            else{
	                start = mid + 1;
	            }
	        }
	        return result;
	    }
}
