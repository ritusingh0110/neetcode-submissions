class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,0,target,nums,ans,new ArrayList<>());
        return ans;
    }
    public void backtrack(int sum,int idx,int target,int[] nums, List<List<Integer>> ans,List<Integer> li){
        if(sum==target){
            ans.add(new ArrayList<>(li));
            return;
        }
         if (idx == nums.length || sum > target) {
            return;
        }
        sum=sum+nums[idx];
        li.add(nums[idx]);
        backtrack(sum,idx,target,nums,ans,li);

        sum=sum-nums[idx];
        li.remove(li.size()-1);
        backtrack(sum,idx+1,target,nums,ans,li);

    }
}
