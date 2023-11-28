public class q18 {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int len = gain.length;
        int cur = 0;
        for (int i = 0; i < len; i++) {
            cur += gain[i];
            ans = Integer.max(ans, cur);
        }
        return ans;
    }
}
