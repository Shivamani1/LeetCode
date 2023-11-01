import java.util.HashSet;
class Solution {
    public int singleNumber(int[] nums) {
      HashSet<Integer> s=new HashSet<>();
        for(int i:nums){
            if(s.contains(i)){
                s.remove(i);
            }
            else
                s.add(i);
        }
        int n=0;
        for(int i:s)
        n=i;
        return n;
   
        
        
        
        
        
        
    }
}