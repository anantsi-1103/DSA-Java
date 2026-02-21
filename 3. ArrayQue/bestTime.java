public class bestTime {

    public static int BestTimeToBuy(int prices[]) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // minimum value
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // calculateProfit
            int profit = prices[i] - minPrice;

            // update max profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }

        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BestTimeToBuy(prices));
    }
}