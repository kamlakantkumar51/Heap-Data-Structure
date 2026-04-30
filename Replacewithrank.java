//psudocode
FUNCTION replacewithrank(arr,N)
temp = copy of arr
sort(temp)
create empty map (value->rank)
rank = 1
FOR each element x in temp:
IF x not in map:
map[x] = rank
rank = rank+1;
FOR i from 0 to N-1:
arr[i] = map[arr[i]]// User function Template for Java
import java.util.*;
class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int temp[] = arr.clone();
        Arrays.sort(temp);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        
        for(int i=0;i<N;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank++);
            }
        }
        for(int i=0;i<N;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
    
RETURN arr


  //code
  
