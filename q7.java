public class q7 {
    public int[] productExceptSelf(int[] nums) {
        int z = nums.length;
        int[] ans1 = new int[z];
        int[] ans2 = new int[z];
        int[] ans = new int[z];
        for (int i = 0; i < z; i++) {
            if (i == 0) {
                ans1[i] = 1;
            } else {
                ans1[i] = ans1[i - 1] * nums[i - 1];
            }
        }
        for (int i = z - 1; i >= 0; i--) {
            if (i == z - 1) {
                ans2[i] = 1;
            } else {
                ans2[i] = ans2[i + 1] * nums[i + 1];
            }
        }
        for (int i = 0; i < z; i++) {
            ans[i] = ans1[i] * ans2[i];
        }
        return ans;

    }
}
