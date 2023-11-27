public class q11 {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        if(len==1){
            return;
        }
        int zst=0;
        boolean z=true;
        if(nums[0]==0){
            z=false;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0 && z==true){
                zst=i;
                z=false;
            }
            if(nums[i]!=0 && nums[i-1]==0){
                int swap=nums[i];
                nums[i]=nums[zst];
                nums[zst]=swap;
                zst++;
            }
        }
    }
}
