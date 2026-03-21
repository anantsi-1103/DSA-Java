import java.util.ArrayList;


public class arr1 {

    public static boolean PairSum(ArrayList<Integer> li, int target) {
        for (int i = 0; i < li.size(); i++) {
            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(i) + li.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean PairSum_pointer(ArrayList<Integer> li, int target) {
        int lp = 0;
        int rp = li.size() - 1;

        while (lp != rp) {
            if (li.get(lp) + li.get(rp) == target) {
                return true;
            }

            if (li.get(lp) + li.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static int maxArea(int height[]) {
        int mx = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;

                int area = h * w;
                mx = Math.max(mx, area);
            }
        }
        return mx;

    }

    public static int MaxArea_pointer(int height[]) {
        int left = 0;
        int right = height.length - 1;

        int mx = 0;
        while (left < right) {

            int h = Math.min(height[left], height[right]);
            int w = right - left;

            int area = h * w;

            mx = Math.max(mx, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> li = new ArrayList<>();

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println("maximum water : " + MaxArea_pointer(height));

        // li.add(1);
        // li.add(2);
        // li.add(3);
        // li.add(4);
        // li.add(5);

        // System.out.println(PairSum(li, 50));

        // // li.add(10);
        // li.add(40);
        // li.add(20);
        // li.add(60);
        // li.add(80);
        // li.add(100);

        // System.out.println(li);

        // System.out.println(li.size());

        // System.out.println(li.indexOf(100));

        // System.out.println(li.contains(100));

        // li.set(2, 1000);
        // System.out.println(li);

        // li.remove(3);
        // System.out.println(li);

        // li.remove(Integer.valueOf(30));
        // System.out.println(li.get(0));
        // System.out.println(li.get(1));
        // System.out.println(li.get(2));
        // System.out.println(li.get(3));
        // System.out.println(li.get(4));
        // System.out.println(li.get(5));

        // Loop
        // for(int i = 0; i< li.size() ; i++){
        // System.out.println(li.get(i));
        // }

        // for of
        // for(Integer i : li){
        // System.out.println(i);
        // }

        // Iterator
        // Iterator it = li.iterator();
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

    }
}
