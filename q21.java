import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q21 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> dic = new HashMap<>();
        for (int i : arr) {
            if (dic.containsKey(i)) {
                dic.put(i, dic.get(i) + 1);
            } else {
                dic.put(i, 1);
            }
        }
        Set<Integer> h = new HashSet<>();
        for (int i : dic.values()) {
            h.add(i);
        }
        if (h.size() == dic.size()) {
            return true;
        }
        return false;
    }

}
