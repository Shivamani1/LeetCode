class Solution {
    public boolean isHappy(int n) {
       int s=0,u,c=0;
        
        do{
            s=0;
            while(n!=0){
            u=n%10;
            n=n/10;
            s+=u*u;
            } 
            n=s;
            c++;
        }while(s!=1&&c<10);
        
  
        
   if(s==1)
       return true;
       return false;
   
    }
}