class Solution {
    public int firstMissingPositive(int[] nums) {
        int A[]=nums;
         int n=A.length;
            for(int i=0;i<n;i++)
                if(A[i]<1||A[i]>n+1)
                    A[i]=n+2;
        
        int temp=0;
            for(int i=0;i<n;i++){
                temp=Math.abs(A[i]);
                if(temp<n+1){
                    if(A[temp-1]<0)
                        continue;
                    else 
                        A[temp-1]=-A[temp-1];
                }
        }
       
             temp=0;
             int i;
            for(i=0;i<n;i++)
                if(A[i]>0)
                    return i+1;
                
            return n+1;
            
            
        }
        
        
        
        
        
        
        
    }
