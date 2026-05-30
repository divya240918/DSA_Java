public class buyAndSellStocks {
    public static int solution(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {8,6,4,15,2};

        int result = solution(prices);
        System.out.println(result);
    }
}
