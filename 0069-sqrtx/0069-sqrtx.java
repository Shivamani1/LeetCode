
class Solution {
    public int mySqrt(int x) {
        long i;
        long r=x;
       for( i=0;i<=r/2+1;i++){
           if(i*i>r)
            return (int)i-1;
       }
      return (int)i-1;  
    }
}