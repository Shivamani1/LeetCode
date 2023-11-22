class Solution {
    public boolean canJump(int[] nums) {
       int reach=0;
       int i=0;
        while(i<=reach&&i<=nums.length-1){
       reach=Math.max(i+nums[i],reach);
            if(reach>=nums.length-1)
                return true;
            i++;
        }
        return false;
        
        
        
    }
}