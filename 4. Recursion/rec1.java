public class rec1 {

    public static int sum(int n) {
        if (n == 0) {
            return n;
        }

        return n + sum(n - 1);
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        // 1 2 3 4 5
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccur(arr, key, i + 1);
    }

    public static int power(int base, int pow) {
        if (pow == 0) {
            return 1;
        }

        return base * power(base, pow - 1);

    }

    public static int powerOptimized(int a, int n) {
        if (n == 0) {
            return 1;
        }

        // half power - universally
        int halfpower = powerOptimized(a, n / 2) * powerOptimized(a, n / 2);

        // odd
        if (n % 2 != 0) {
            halfpower = a * halfpower;
        }

        return halfpower;
    }

    // tillingProblem ->
    public static int tillingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fn1 = tillingProblem(n - 1); // vertical
        int fn2 = tillingProblem(n - 2); // horizontal

        return fn1 + fn2;
    }

    // Merge , Quick -> Divide n Conquror
    public static void main(String[] args) {
        // int arr[] = { 5,4,3,1,2};
        // System.out.println(isSorted(arr, 0));

        // System.out.println(power(2, 5));
        // System.out.println(powerOptimized(2, 5));


        System.out.println(tillingProblem(4));



    }



}
