class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,r=0;
        int[] ans=new int[nums.length-k+1];
        int idx=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

        while(r<nums.length){
           pq.offer(new int[]{nums[r],r});
           while(r-l+1>k){
            l++;
           }
           while(!pq.isEmpty()&& pq.peek()[1]<l){
            pq.poll();
           }
           if(r-l+1==k){
            ans[idx++]=pq.peek()[0];
           }
           r++;
        }
        return ans;
    }
}
