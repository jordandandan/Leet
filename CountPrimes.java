package src;

public class CountPrimes {
	 public int countPrimes(int n) {
	        boolean[] notPrime = new boolean[n];
	        for(int i=2;i*i<n;i++){
	        	if(!notPrime[i]){
	        		for(int j=i;i*j<n;j++)
	        			notPrime[j*i] = true;
	        	}
	        
	        }
	        int res = 0;
	        for(int i=2;i<n;i++)
	        	if(!notPrime[i])
	        		res++;
	        return res;
	 }
}
