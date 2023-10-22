
class Solution {
    public int mySqrt(int x) {
        long i;
        
       for( i=0;i<=x/2+1;i++){
           if(i*i>x)
            return (int)i-1;
       }
      return (int)i-1;  
    }
}