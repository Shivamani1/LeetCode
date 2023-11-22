class Solution {
    public int jump(int[] nums) {
      
        int cur=0,flag=0,c=0,n=nums.length-1;
        for(int i=0;i<n;i++){
            cur=Math.max(cur,i+nums[i]);
            if(i==flag){
             c++;
             flag=cur;
            }

        }
        return c;
    }
}