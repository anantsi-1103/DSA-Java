public class trapping {

    public static int trap(int height[]) {

        int n = height.length;
        int totalWater = 0;

        for (int i = 0; i < n; i++) {
            // find max on left
            int leftMax = height[i]; // phela index hi mera left max hai 
            for(int j = i-1; j >=0 ; j--){
                leftMax = Math.max(leftMax, height[j]);
            }   

             // find max on right
            int rightMax = height[i]; // phela index hi mera left max hai 
            for(int j = i+1; j <n  ; j++){
                rightMax = Math.max(rightMax, height[j]);
            }   

            int water = Math.min(leftMax,rightMax) - height[i];
            totalWater+= water;
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 3, 2, 5 };

        System.out.println(trap(height));
    }
}
