public class q12 {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if(l1<1){
            return true;
        }
        int i=0;int j=0;
        while(i<l2){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            i++;
            if(j==l1){
                return true;
            }
        }
        return false;
    }
}
