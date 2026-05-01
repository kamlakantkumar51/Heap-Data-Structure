//bruteforce approach      
import java.util.*;
class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        List<Integer> ans = new ArrayList<>();
        
        for(int num1:a){
            for(int num2:b){
                ans.add(num1+num2);
            }
        }
        ans.sort(Collections.reverseOrder());
        
        return ans.subList(0,k);
    }
}
