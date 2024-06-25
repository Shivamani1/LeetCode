class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        
        for(int i=0;i<nums.length;i++){
            if(c%2!=0)
                nums[i]=nums[i]==0?1:0;
            
            if(nums[i]==0){
                nums[i]=1;
                c++;
            }
        }
        
        return c;
    }
}