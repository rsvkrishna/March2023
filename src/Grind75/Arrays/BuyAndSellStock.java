package Grind75.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));

    }

    public static int buyAndSellStock(int[] prices){
        int maxProfit=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-min);
        }

        return maxProfit;
    }
}
