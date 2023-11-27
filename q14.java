import java.util.Arrays;

public class q14 {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int l = 0;
        int r = len - 1;
        int ans = 0;
        while (l < r) {
            if (nums[l] + nums[r] == k) {
                ans++;
                l++;
                r--;
            } else if (nums[l] + nums[r] < k) {
                l++;
            } else if (nums[l] + nums[r] > k) {
                r--;
            }
        }
        return ans;

    }
}
