class Solution {
    public int differenceOfSums(int n, int m) {
       int i,a=0,b=0;
        for(i=1;i<=n;i++){
            if(i%m!=0)
             a=a+i   ;
            else
                b=b+i;
        }
        return a-b;
        
        
    }
}