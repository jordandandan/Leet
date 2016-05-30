import java.util.HashSet;
import java.util.Set;


public class HappyNumber {
	public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1){
        	if(set.contains(n))
        		return false;
        	
        	set.add(n);
        	int sum=0;
        	while(n>0){
        		int num = n%10;
        		sum += num*num;
        		n /= 10;
        	}
        	n = sum;
        }
        return true;
    }
}
