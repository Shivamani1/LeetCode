public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
int x,ans=0,c=0;
        while(c<32&&n!=0){
      x=n&1;
        ans=ans<<1;    
      if(x==1)
          ans=ans|1;
           n=n>>1;
            c++;
        }
        c=32-c;
        System.out.println(c);
        while(c>0){
        ans=ans<<1;    
            c--;
          }
        
        
        
        return ans;
    }
}