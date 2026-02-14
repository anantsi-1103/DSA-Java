import java.util.Arrays;
import java.util.Collections;

public class sorting {

    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]) {
        // index
        for (int i = 0; i < arr.length; i++) {
            // particular number ko swap krne m madad
            for (int j = 0; j < arr.length - i - 1; j++) {
                // apne current position ko aapne aage position se compare kr rha hai
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            // find the smallest element
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // smallest element ko i ki jagah patak de rha hai
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void InsertionSort(int arr[]){
        for(int i = 1; i<arr.length ; i++){
            int key = arr[i];
            int j = i -1;

            //Move the element greater than key
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
    
    
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 3, 1, 2 };

        printArray(arr);
        // InsertionSort(arr);

        // java collection framework  -> 
        // Arrays.sort(arr, Collections.reverseOrder());

        // Arrays.binarySearch(arr, 10);
        printArray(arr);

    }
}
