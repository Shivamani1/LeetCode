class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet();
        int c=1,max=0;
        for(int i:nums)
            s.add(i);
        for(int i:nums){
                if(!s.contains(i-1)){
                    c=0;                          
                while(s.contains(i+c)){
               s.remove(i+c);
                    c++;     
                }  
                }
            max=Math.max(max,c);
        }
            return max;
            
        
        
        
        
    
    
    }
}