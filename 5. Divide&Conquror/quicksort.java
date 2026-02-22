public class quicksort {

    public static void printArray(int arr[]) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivotInd = partition(arr, left, right);

            // left
            quickSort(arr, left, pivotInd - 1);
            quickSort(arr, pivotInd + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] , arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

    }

}
