import java.util.Stack;

public class q6 {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        int a = 0, b = s.length() - 1;
        while (a <= b && s.charAt(a) == ' ')
            a++;
        while (b >= a && s.charAt(b) == ' ')
            b--;
        s = s.substring(a, b + 1);
        int l = 0;
        boolean first = true;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                st.push(s.substring(l, i + 1) + " ");
            } else if (s.charAt(i) == ' ') {
                if (s.charAt(i - 1) == ' ') {
                    System.out.println("djhajsdh");
                    l = i + 1;
                    continue;
                } else {
                    if (first) {
                        st.push(s.substring(l, i));
                        first = false;
                        l = i + 1;
                    } else {
                        st.push(s.substring(l, i) + " ");
                        l = i + 1;
                    }
                }

            }
        }
        String ans = "";
        while (!st.empty()) {
            ans += st.pop();
        }
        int b1 = ans.length() - 1;
        if (ans.charAt(b1) == ' ') {
            ans = ans.substring(0, b1);
        }
        return ans;
    }
}
