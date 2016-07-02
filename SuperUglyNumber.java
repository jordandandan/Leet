package src;

public class SuperUglyNumber {
	public int nthSuperUglyNumber(int n, int[] primes) {
        int[] res = new int[n];
        int[] count = new int[primes.length];
        res[0] = 1;
        for(int i=1;i<n;i++){
        	int min = Integer.MAX_VALUE;
        	for(int j=0;j<primes.length;j++){
        		min = Math.min(min, primes[j]*res[count[j]]);
        	}
        	res[i] = min;
        	for(int j=0;j<primes.length;j++){
        		if(primes[j]*res[count[j]]==min)
        			count[j]++;
        	}
        }
        return res[n-1];
    }
}
