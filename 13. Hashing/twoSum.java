import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 2, 19 };

        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                System.out.println(diff + " " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }
    }
}
