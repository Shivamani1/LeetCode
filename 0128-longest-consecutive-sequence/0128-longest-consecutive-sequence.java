class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet();
        int c=1,max=0;
        for(int i=0;i<nums.length;i++)
            s.add(nums[i]);
        for(int i=0;i<nums.length;i++){
                if(!s.contains(nums[i]-1)){
                    c=1;
                while(s.contains(nums[i]+c))
                    c++;
                }
            max=Math.max(max,c);
        }
            return max;
            
        
        
        
        
    
    
    }
}