class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0,k=0;
        int n=nums.length;
for(int i=1;i<n;i++)
    if(nums[i-1]!=nums[i])
        nums[k++]=nums[i-1]; 
        
 nums[k++]=nums[n-1];
        
        
    return k;    
    }
}