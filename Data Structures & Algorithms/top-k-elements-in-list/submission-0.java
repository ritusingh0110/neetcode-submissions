class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] ans=new int[k];
        int idx=0;
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int ele:map.keySet()){
            q.offer(ele);
        }
        while(k>0){
            ans[idx++]=q.poll();
            k--;
        }
        return ans;
    }
}
