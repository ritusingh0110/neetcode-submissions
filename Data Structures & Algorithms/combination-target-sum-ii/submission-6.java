class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
      HashSet<List<Integer>> set=new HashSet<>();
      backtrack(0,0,candidates,target,set,new ArrayList<>());
      return new ArrayList<>(set);

    }
    public void backtrack(int idx,int sum,int[] arr,int k,HashSet<List<Integer>> ans,ArrayList<Integer> li){
        if(sum==k){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(sum>k||idx==arr.length)return;
        sum=sum+arr[idx];
        li.add(arr[idx]);
        backtrack(idx+1,sum,arr,k,ans,li);
        while (idx + 1 < arr.length &&
            arr[idx] == arr[idx + 1]) {
            idx++;
        }
        
        sum=sum-arr[idx];
        li.remove(li.size()-1);
        backtrack(idx+1,sum,arr,k,ans,li);
    }
   
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna