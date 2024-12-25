class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0,max=0;
        for(int i:gain){
            ans+=i;
            max=Math.max(ans,max);
        }
        return max;
    }
}