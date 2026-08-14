class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                pro=pro*nums[i];
            }

        }
        int[] ans=new int[nums.length];
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && zero>1){
                return a;
            }
            else if(nums[i]==0 && zero==1){
                ans[i]=pro;
            }
            else{
                if(zero>=1){
                    ans[i]=0;
                }else{
                  ans[i]=pro/nums[i];
                }
            }

        }
        return ans;
    }
}  
