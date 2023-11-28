public class q15 {
    public int maxVowels(String s, int k) {
        int len =s.length();
        int num=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                num++;
            }
        }  
        int ans =num;
        for(int j=k;j<len;j++){
            if(isvowel(s.charAt(j))){
                num++;
            }
            if(isvowel(s.charAt(j-k))){
                num--;
            }
            if(num>ans){
                ans=num;
            }
        }
        return ans;
    }
    public boolean isvowel(char a){
        if(a=='a' ||a=='u' ||a=='o' ||a=='i' ||a=='e'){
            return true;
        }
        return false;
    }
}
