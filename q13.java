public class q13 {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ans = Integer.MIN_VALUE;
        while (i < j) {
            ans = Integer.max(ans, (j - i) * (Integer.min(height[i], height[j])));
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }

}
