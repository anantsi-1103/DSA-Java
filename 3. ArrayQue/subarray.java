public class subarray {

    public static void printSubarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int maxSubarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }

    public static int kadanes(int arr[]) {
        int cs = arr[0];
        int ms = arr[0];

        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(ms, cs);
        }
        return ms;
    }

    public static void main(String[] args) {
        int arr[] = { 3, -4, 5, 4, -1, 7, -8 };

        // printSubarray(arr);

        System.out.println(maxSubarray(arr));

    }
}
