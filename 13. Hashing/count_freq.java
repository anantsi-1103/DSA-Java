import java.util.HashMap;

public class count_freq {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,2,2,1,5};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }

        for(int k : map.keySet()){
            System.out.println(k + " -> "+ map.get(k));
        }
    }
}
