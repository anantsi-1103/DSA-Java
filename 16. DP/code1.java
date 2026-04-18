public class code1 {

    public static int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fibo_Memo(int n, int f[]) { // 5
        if (n == 1 || n == 0) {
            return n;
        }

        if (f[n] != 0) { // f[n] is already calculated
            return f[n];
        }

        f[n] = fibo_Memo(n - 1, f) + fibo_Memo(n - 2, f);
        return f[n];
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            // dp[5] = dp[4] + dp[3]
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1];

        System.out.println(fibo(n));
        System.out.println(fibo_Memo(n, f));
        System.out.println(fibTabulation(n));

    }
}
