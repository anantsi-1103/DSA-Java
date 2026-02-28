public class subset {

    public static void findSubset(String str, String ans, int i) {

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // yes
        findSubset(str, ans + str.charAt(i), i + 1);
        // No
        findSubset(str, ans, i + 1);
    }

    public static void permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i); // a,b,c
            // abcde -> ab + de -> abde
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, ans + curr);
        }

    }

    public static int gridway(int i, int j, int n, int m) {
        if (i == n - 1 || j == m - 1) {
            return 1;
        }

        else {
            if (i == n || j == m) {
                return 0;
            }
        }

        int w1 = gridway(i + 1, j, n, m); // down
        int w2 = gridway(i, j + 1, n, m); // right

        return w1+w2;
    }

    public static void main(String[] args) {
        // String str = "abc";

        // // findSubset(str, "", 0);
        // permutation(str, "");

        int n = 3; int m = 3;
        System.out.println(gridway(0,0,n,m));
    }
}
