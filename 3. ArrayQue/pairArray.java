public class pairArray {

    public static void pairArrayCode(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // 3
            for (int j = i + 1; j < arr.length; j++) { // 4
                System.out.println("(" + arr[i] + " , " + arr[j] + ")");
                // (3,4)
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        pairArrayCode(arr);
    }
}
