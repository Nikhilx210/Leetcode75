public class q14 {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double ans = sum / k;
        for (int j = k; j < len; j++) {
            sum -= nums[j - k];
            sum += nums[j];
            if (sum / k > ans) {
                ans = sum / k;
            }
        }
        return ans;
    }
}
