import java.util.HashMap;

public class hash2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Aman");
        map.put(102, "Arun");
        map.put(103, "Ajay");
        map.put(104, "Akash");

        System.out.println(map);

        System.out.println(map.get(102));

        // if(map.containsKey(102)){
        //     System.out.println("Key exists");
        // }else{
        //     map.put(102, "Akash");
        // }


        System.out.println(map.containsValue("Aman"));
        
    }
}
