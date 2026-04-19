public class Knapsnack {

    public static int knapsnack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {
            // valid
            // include
            int ans1 = val[n - 1] + knapsnack(val, wt, W - wt[n - 1], n - 1);
            //
            int ans2 = knapsnack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);

        } else {
            // not valid
            return knapsnack(val, wt, W, n - 1);
        }
    }

    public static int knapsnack_memo(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            // apne uski value already define kr rkhi hai
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // valid
            // include
            int ans1 = val[n - 1] + knapsnack_memo(val, wt, W - wt[n - 1], n - 1, dp);
            //
            int ans2 = knapsnack_memo(val, wt, W, n - 1, dp);

            return Math.max(ans1, ans2);

        } else {
            // not valid
            return knapsnack_memo(val, wt, W, n - 1, dp);
        }
    }

    public static int knapsnack_tabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // 0th column
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        // 0th row
        for (int j = 0; j < dp.length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for(int j = 1; j< W+1 ; j++){
                // ith item val
                int v = val[i-1];
                // ith item wt
                int w = wt[i-1];
 
                if(w <= j){  // wt <= j -> valid
                    // include
                    int incProfit = v + dp[i-1][j-w];
                    int excprofit =  dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excprofit);
                }
                else{
                    // invalid
                    int excprofit = dp[i-1][j];
                    dp[i][j] = excprofit;

                }
            }
        }
        return dp[n][W];

    }

    public static int unboundedKnapsack(int[] val, int[] wt, int W) {

        int n = val.length;

        // DP array
        int[] dp = new int[W + 1];

        // Build DP array
        for (int i = 0; i <= W; i++) {

            for (int j = 0; j < n; j++) {

                if (wt[j] <= i) {

                    dp[i] = Math.max(
                            dp[i],
                            dp[i - wt[j]] + val[j]
                    );

                }
            }
        }

        return dp[W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        int dp[][] = new int[val.length + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }

        }

        System.out.println(knapsnack_tabulation(val,wt,W));
        System.out.println(knapsnack_memo(val, wt, W, val.length, dp));
        System.out.println(knapsnack(val, wt, W, val.length));
        System.out.println(unboundedKnapsack(val, wt, W));
    }
}