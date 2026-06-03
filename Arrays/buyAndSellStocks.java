// # Best Time to Buy and Sell Stock

// ## Problem
// Given an array where prices[i] represents the stock price on day i,
// find the maximum profit that can be achieved by buying once and selling once.

// ## Approach
// - Keep track of the minimum price seen so far.
// - At each day, calculate the profit if sold today.
// - Update the maximum profit whenever a better profit is found.

// ## Time Complexity
// O(n)

// ## Space Complexity
// O(1)

// ## Key Learning
// This problem teaches:
// - Running minimum tracking
// - Single-pass array traversal
// - Optimization from brute force O(n²) to O(n)

// ## Related Concepts
// Arrays, Greedy

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
