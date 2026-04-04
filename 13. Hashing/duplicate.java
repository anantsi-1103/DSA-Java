import java.util.HashMap;

public class duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 2, 3, 3, 2,7,6,8 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        System.out.println("Duplicates");

        for (int k : map.keySet()) {
            if (map.get(k) > 1) {
                System.out.println(k);
            }
        }
    }
}
