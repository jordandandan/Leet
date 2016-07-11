
public class BitwiseANDofNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
      int i = 0;
      /*
       * m!=n means that there are must odd and even number in the range [m,n]
       * so the lowest bit of result must be 0
       */
      while(m!=n){
    	  m>>=1;
    	  n>>=1;
    	  i++;
      }
      m<<=i;
      return m;
    }
}
