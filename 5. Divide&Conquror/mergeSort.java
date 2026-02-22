public class mergeSort {

    public static void printArray(int arr[]) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void Sort(int arr[], int left, int right, int temp[]) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort
            Sort(arr, left, mid, temp);
            Sort(arr, mid + 1, right, temp);

            merge(arr, left, mid, right, temp);
        }
    }

    public static void merge(int arr[], int left, int mid, int right, int temp[]) {
        int i = left; // left half pointer
        int j = mid + 1; // right half pointer
        int k = left;

        // comare and store
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

            }
        }

        // copy for remaing of the left side
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // copy for remaing of the right side
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // copy back to original
        for (int o = left; o <= right; o++) {
            arr[o] = temp[o];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 6, 3, 9, 2 };
        int temp[] = new int[arr.length];

        printArray(arr);
        
        Sort(arr, 0, arr.length-1, temp);
        printArray(arr);
    }
}
