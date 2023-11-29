import java.util.Arrays;
import java.util.HashMap;

public class q22 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            Character z = word1.charAt(i);
            if (s1.containsKey(z)) {
                s1.put(z, s1.get(z) + 1);
            } else {
                s1.put(z, 1);
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            Character z = word2.charAt(i);
            if (s2.containsKey(z)) {
                s2.put(z, s2.get(z) + 1);
            } else {
                s2.put(z, 1);
            }
        }
        for (Character i : s1.keySet()) {
            if (!s2.containsKey(i)) {
                return false;
            }
        }
        int[] a = new int[s1.keySet().size()];
        int[] b = new int[s1.keySet().size()];
        int apnt = 0;
        int bpnt = 0;
        for (int i : s1.values()) {
            a[apnt] = i;
            apnt++;
        }
        for (int i : s2.values()) {
            b[bpnt] = i;
            bpnt++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
