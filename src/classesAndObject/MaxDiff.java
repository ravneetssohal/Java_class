package classesAndObject;

public class MaxDiff {
    public static int maxProfit(int[] prices) {
        int difference;
        int maxdifference = 0;
        for (int j = 0; j < prices.length; j++) {
            for (int i = j + 1; i < prices.length; i++) {

                if (prices[j]<prices[i]){
                    difference = prices[i] - prices[j];
                    if(difference > maxdifference){
                        maxdifference = difference;
                    }
                }
            }
        }
        return maxdifference;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Maximum difference for prices1: " + maxProfit(prices1));
        System.out.println("Maximum difference for prices2: " + maxProfit(prices2));
    }
}
