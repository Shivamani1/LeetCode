class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int c=0;
        int maxLen=0;
        int start=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zero++;
            while(zero>k&&start<=i){
                if(nums[start]==0)
                    zero--;
                start++;
            }
         
            maxLen=Math.max(i-start+1,maxLen);
        }
        
        return maxLen;
        
        
        
    }
}