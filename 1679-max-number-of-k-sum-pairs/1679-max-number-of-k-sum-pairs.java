class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start=0,end=nums.length-1;
        int c=0;
        while(start<end){
            int temp=nums[start]+nums[end];
            if(temp>k)
                end--;
            else if(temp<k)
                start++;
            else{
                c++;
                start++;
                end--;
            }
            
        }
        return c;
        
        
        
        
        
    }
}