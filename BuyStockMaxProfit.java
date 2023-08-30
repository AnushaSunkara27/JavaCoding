public class BuyStockMaxProfit {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;


        int currentPrice = prices[0];
        int n = prices.length;
        for(int i = 1; i<n; i++) {
            if(prices[i] < currentPrice) {
                currentPrice = prices[i];
            } else {
                int currentProfit = prices[i] - currentPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }


        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println("max is" + maxProfit(arr));
    }
    
}
