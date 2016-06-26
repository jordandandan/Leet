package src;

public class FirstBadVersion {
	 public int firstBadVersion(int n) {
	        int start = 1;
	        int end = n;
	        while(start<end){
	        	int mid = start + (end-start)/2;//if we use(start+end)/2 will exceed the max value
	        	if(!isBad(mid))
	        		start = mid+1;
	        	else
	        		end = mid;
	        }
	        return start;	
	    }

	private boolean isBad(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
