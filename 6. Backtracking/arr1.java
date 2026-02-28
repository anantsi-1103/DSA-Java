public class arr1{

    public static void ChangeArr(int arr[] , int i , int val){
        if(i == arr.length){
            PrintArray(arr);
            return;
        }
        arr[i] =val;
        ChangeArr(arr, i+1, val+1);  // [1,2,3,4,5] , 2 , 3
        // backtracking - original memory  - Stack khali -> 
        arr[i] = arr[i] - 3;
    }


    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }




    public static void main(String args[]){
        int arr[] = new int[5];

        ChangeArr(arr, 0, 1);
        // after backtracking
        PrintArray(arr);
    }

}