public class q16 {
    // best optimized
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            end++;
            if (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
        }
        return end - start;
    }
    // public int longestOnes(int[] nums, int k) {
    // int len =nums.length;
    // int ans =Integer.MIN_VALUE;
    // if(k==0){
    // int cnt=nums[0];
    // for(int i=1;i<len;i++){
    // if(nums[i]==1 && nums[i-1]==1){
    // cnt++;
    // }
    // else{
    // if(nums[i]==1){
    // cnt=1;
    // }else{
    // cnt=0;
    // }

    // }
    // if(cnt>ans){
    // ans=cnt;
    // }
    // }
    // return ans;
    // }

    // int cur=0;
    // int left=0;
    // int right=0;
    // while(right<len && left<=right){
    // if(nums[right]==1){
    // right++;
    // cur++;
    // }
    // else if(nums[right]==0 && k>0){
    // k--;
    // cur++;
    // right++;
    // }
    // else if(nums[right]==0 && k==0){
    // if(nums[left]==0){
    // k++;
    // }
    // cur--;
    // left++;
    // }
    // if(cur>ans){
    // ans=cur;
    // }
    // }
    // return ans;
    // }

}
