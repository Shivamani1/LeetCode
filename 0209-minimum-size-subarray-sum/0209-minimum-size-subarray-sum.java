class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int left=0,right=0;
        int s=0;
        int min=Integer.MAX_VALUE;
        while(left<=right&&right<nums.length){
            s+=nums[right];
            System.out.println(s);
            while(s>=target&&left<=right){
                min=Math.min(min,right-left+1);
                s-=nums[left];
                left++;
            }
            right++;
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        return min;
        
    }
}