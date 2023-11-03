class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,c=0;
        for(int i:nums)
            c=c+i;
        return (n*(n+1))/2-c;
    }
}