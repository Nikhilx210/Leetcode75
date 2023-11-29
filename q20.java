import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q20 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for (int i : s1) {
            if (!s2.contains(i)) {
                a1.add(i);
            }
        }
        for (int i : s2) {
            if (!s1.contains(i)) {
                a2.add(i);
            }
        }
        ans.add(a1);
        ans.add(a2);
        return ans;
    }
}
