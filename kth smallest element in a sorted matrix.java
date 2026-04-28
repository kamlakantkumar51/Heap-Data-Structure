class Solution {
    public int kthSmallest(int[][] matrix, int k) {
     //max heap case
     PriorityQueue<Integer> ans = new PriorityQueue<>((a,b)->(b-a));
     for(int row[]:matrix){
        for(int num:row){
            ans.offer(num);

            if(ans.size() > k){
                ans.poll();
            }
        }
     }
     return ans.peek();

    }
}
