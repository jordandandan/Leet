
public class BestTimetoBuyandSellStock {
	 public int maxProfit(int[] prices) {
	        if(prices.length<2)
	        	return 0;
	        int maxProfit = 0;
	        int minBuy = Integer.MAX_VALUE;
	        for(int i=0;i<prices.length;i++){
	        	if(prices[i]<minBuy)
	        		minBuy = prices[i];
	        	if(prices[i]-minBuy>maxProfit){
	        		maxProfit = prices[i] - minBuy;
	        	}
	        }
	        return maxProfit;
	    }
}
