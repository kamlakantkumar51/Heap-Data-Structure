import java.util.*;
class Solution {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2){
            return Integer.compare(p2.val,this.val);
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        //first window
        for(int i=0;i<k;i++){
            pq.add(new Pair(nums[i],i));
        }
        ans[0] = pq.peek().val;
        //remove out of window
        for(int i=k;i<n;i++){
            while(!pq.isEmpty() && pq.peek().idx <= i-k){
                pq.poll();
            }
            pq.add(new Pair(nums[i],i));
            ans[i-k+1] = pq.peek().val;
        }
        return ans;
    }
}
