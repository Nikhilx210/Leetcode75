public class q9 {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int count = 1;
        String ans = "";
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                if (chars[i] == chars[i - 1]) {
                    ans += chars[i] + Integer.toString(count);
                    break;
                } else {
                    ans += chars[i];
                }
            } else {
                if (chars[i] == chars[i + 1]) {
                    count++;
                } else {
                    if (count > 1) {
                        ans += chars[i] + Integer.toString(count);
                    } else {
                        ans += chars[i];
                    }
                    count = 1;
                }
            }
        }
        char[] compressedChars = ans.toCharArray();
        for (int i = 0; i < compressedChars.length; i++) {
            chars[i] = compressedChars[i];
        }
        return compressedChars.length;
    }
}
