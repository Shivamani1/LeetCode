class Solution {
    public int maximumStrongPairXor(int[] nums) {
       int c=0,cmax=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if((Math.abs(nums[i]-nums[j]))<=Math.min(nums[i],nums[j]))
                    c=nums[i]^nums[j];
              
                if(c>cmax)
                cmax=c;
            }
         if(c>cmax)
                cmax=c;
        }
                return cmax;
   
        
        
        
    }
}