import java.util.ArrayList;
import java.util.List;

public class q3 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = Integer.MIN_VALUE;
        List<Boolean> ans = new ArrayList<Boolean>();
        for (int i = 0; i < len; i++) {
            max = Integer.max(max, candies[i]);
        }
        for (int i = 0; i < len; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
