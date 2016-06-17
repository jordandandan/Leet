package src;

public class BulbSwitcher {
	//完全平方数因子个数为奇数个，最后才会亮，所以找n以内的完全平方数的个数
	  public int bulbSwitch(int n) {
	      int res = 0;  
		  for(int i=1;i*i<=n;i++){
			  res++;
		  }
		  return res;
	    }
}
