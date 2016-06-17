package src;

public class FactorialTrailingZeroes {

	//求数中10的因数个数，即求2和5的由于n/2>n/5 即求5的x次幂的因数的个数即可
	public int trailingZeroes(int n) {
        int res = 0;
        while(n>0){
        	res += n/5;
        	n /= 5;
        }
        return res;
    }
}
