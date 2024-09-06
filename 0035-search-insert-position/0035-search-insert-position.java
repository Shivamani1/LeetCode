class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(h>=l){
            int mid=(l+h)/2;
            if(target<nums[mid]){
                h=mid-1;
                ans=mid;
            } 
            else if(target>nums[mid])
                l=mid+1;
            else return mid;
        }
        if(ans==-1){
           return target<nums[0]?0:nums.length;
        }
        return ans;
    }
}