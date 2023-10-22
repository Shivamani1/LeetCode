class Solution {
  
    public int climbStairs(int n) {
        int a=1,b=1,i,c=0;
        if(n==1)
         return 1;
     for(i=1;i<n;i++){
         c=a+b;
         a=b;
         b=c;
     }
        
        
       return c; 
    }
}