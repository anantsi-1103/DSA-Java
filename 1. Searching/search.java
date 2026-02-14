public class search{


    public static int LinearSearch(int arr[], int key){
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int arr[] , int key){
        int si = 0;
        int ei = arr.length-1;

        while(si <= ei){
            int mid = (si+ei)/2;

            // mid == key
            if(arr[mid] == key){
                return mid;
            }
            // arr[mid] < key se
            else if(arr[mid] < key){
                si = mid + 1;
            }
            else{
                   // arr[mid] > key se
                ei = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,1,6,8,6,99,55,34,86};

            int arr[] = {2,4,6,8,10};
        System.out.println(BinarySearch(arr,6));

    }
}