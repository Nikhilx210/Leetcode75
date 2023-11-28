public class q19 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int ts = 0;
        int ls = 0;
        for (int i = 0; i < len; i++) {
            ts += nums[i];
        }
        for (int i = 0; i < len; i++) {
            if ((ls * 2) == ts - nums[i]) {
                return i;
            }
            ls += nums[i];

        }
        return -1;
    }
}