import java.util.Arrays;

import org.junit.Test;


public class CoinChange {
	public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, 0);
        int min = 0;
        for(int i=1;i<=amount;i++){
        	min = Integer.MAX_VALUE;
        	for(int j=0;j<coins.length;j++){
        		 if(coins[j]<=i)
         		    if(min>(long)dp[i-coins[j]]+1){// MaxValue + 1 may lead to overflow -> MinValue
                         min = dp[i-coins[j]]+1;
                     }
        	}
        	dp[i] = min;
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
	@Test
	public void test(){
		int[] coins = {2};
		int amount = 3;
		System.out.println(coinChange(coins,3));
	}
}
