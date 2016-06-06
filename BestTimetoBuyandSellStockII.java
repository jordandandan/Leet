
public class BestTimetoBuyandSellStockII {
	 	//a greedy solution
		public int maxProfit(int[] prices) {
	        if(prices.length==0){
	        	return 0;
	        }
	        int profit = 0;
	        int minBuyIndex = 0;
	        for(int i=1;i<prices.length;i++){
	        	if(prices[i]<prices[i-1]){
	        		profit += prices[i-1]-prices[minBuyIndex];
	        		minBuyIndex = i;
	        	}
	        	//the last transction
	        	
	        }
	        if(prices[prices.length-1]>prices[minBuyIndex]){
        		profit += prices[prices.length-1] - prices[minBuyIndex];
        	}
	        return profit;
	    }
}
