class Solution {
    public int kthFactor(int n, int k) {
     int i,c=0;
        for(i=1;i<=n+1;i++){
            if(c==k)
                return i-1;
            if(n%i==0){
                c++;
            }
        }
        return -1;
    }
}