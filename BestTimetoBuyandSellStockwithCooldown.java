package src;

public class BestTimetoBuyandSellStockwithCooldown {
	 public int maxProfit(int[] prices) {
	        if(prices.length==0)
	        	return 0;
	        // 表示当天最终未持股的情况下，当天结束后的累计最大利润
	        int[] sellDp = new int[prices.length];
	        // 表示当天最终持股的情况下，当天结束后的累计最大利润
	        int[] buyDp = new int[prices.length];
	        sellDp[0] = 0;
	        buyDp[0] = -prices[0];
	        for(int i=1;i<prices.length;i++){
	        	sellDp[i] = Math.max(sellDp[i-1], buyDp[i-1]+prices[i]);
	        	if(i>=2){
	        		buyDp[i] = Math.max(buyDp[i-1], sellDp[i-2]-prices[i]);
	        	}else{
	        		buyDp[i] = Math.max(buyDp[i-1], -prices[i]);
	        	}
	        }
	        return sellDp[prices.length-1];
	 }
}
