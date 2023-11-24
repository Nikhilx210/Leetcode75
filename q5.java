public class q5 {
    public boolean isvowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (isvowel(s.charAt(i)) && isvowel(s.charAt(j))) {
                char swap = s.charAt(i);
                s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1);
                s = s.substring(0, j) + swap + s.substring(j + 1);
                i++;
                j--;
            } else if (isvowel(s.charAt(i))) {
                j--;
            } else if (isvowel(s.charAt(j))) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return s;
    }
}
