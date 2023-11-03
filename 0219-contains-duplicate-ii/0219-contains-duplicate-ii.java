import java.util.HashMap;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(nums[i]))
                m.put(nums[i],i);
             else{
                 int n=Math.abs(m.get(nums[i])-i);
                 if(n<=k)
                     return true;
                 else
                     m.put(nums[i],i);
             }
        }
   return false;
    }
    
}