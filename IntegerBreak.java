package src;

public class IntegerBreak {
	/*7 = 3 * 2 * 2
	8 = 3 * 3 * 2
	9 = 3 * 3 * 3
	10 = 3 * 3 * 2 * 2
	11 = 3 * 3 * 3 * 2
	12 = 3 * 3 * 3 * 3
	13 = 3 * 3 * 3 * 2 * 2*/
	public int integerBreak(int n) {
        if(n==2)
        	return 1;
        if(n==3)
            return 2;
        if(n==4)
        	return 4;
        int res = 1;
        while(n>4){
        	res *= 3;
        	n -= 3;
        }
        res *= n;
        return res;
    }
}
