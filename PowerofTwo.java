
public class PowerofTwo {
	public boolean isPowerOfTwo(int n) {
        return n>0&&Math.pow(2, Math.round(Math.log(n)/Math.log(2)))==n;
    }
}
