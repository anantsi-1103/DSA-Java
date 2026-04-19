import java.util.Arrays;

public class Fractional {
    public static void main(String[] args) {
        int profit[] = { 25, 24, 15 };
        int weight[] = { 18, 15, 10 };
        // double ratiop[] =
        int capacity = 20;

        int n = weight.length;

        double ratio[] = new double[n];
        Integer index[] = new Integer[n];

        // ratio calculate
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) profit[i] / weight[i];
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> Double.compare(ratio[b], ratio[a]));

        double totalProfit = 0;


        for(int i = 0; i<n ; i++){
            int idx = index[i];

            if(capacity >= weight[idx]){
                capacity -= weight[idx];
                totalProfit += profit[idx];
            }

            else{
                // capacity is not enough for the weight but u still left a space for adding
                totalProfit += ratio[idx] * capacity;
                break;
            }
        }

        System.out.println("Maximum Profit : "+ totalProfit);

    }
}
