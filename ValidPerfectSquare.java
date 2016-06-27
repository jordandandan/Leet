
public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start<end){
        	int mid = start+ (end-start)/2;
        	int temp = mid*mid;
        	if(temp>num)
        		end--;
        	else if(temp<num)
        		start++;
        	else
        		return true;
        }
        return false;
    }
}
