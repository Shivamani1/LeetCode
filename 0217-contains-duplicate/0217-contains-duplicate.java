import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums){
            if(!s.contains(i))
                s.add(i);
            else
                return true;
        }
        if(s.size()==nums.length)
            return false;
        return true;
    }
}