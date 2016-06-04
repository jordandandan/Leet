
public class PowerofThree {
	 public boolean isPowerOfThree(int n) {
		 	return n>0&&Math.pow(3, Math.round(Math.log(n)/Math.log(3)))==3;
	    }
}
