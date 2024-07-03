class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            if(temp<height[i]){
                temp=height[i];
            }
            else{
              l[i]=temp;  
            }
        }
        temp=0;
        for(int i=n-1;i>=0;i--){
            if(temp<height[i]){
                temp=height[i];
            }
            else{
              r[i]=temp;  
            }
            
        }   
        int c=0;
        for(int i=0;i<n;i++){
         temp= Math.min(l[i],r[i])  ;
            if(temp!=0)
           c+=temp-height[i]; 
        }
        
        
        
        return c;
    }
}