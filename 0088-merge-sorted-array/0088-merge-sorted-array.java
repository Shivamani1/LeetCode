class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
    int     k=m+n+1;
        while(n!=-1&&k!=-1){
        if(m==-1||nums1[m]<=nums2[n]){ 
            nums1[k]=nums2[n];
          n-- ;  
           }
        else{
            nums1[k]=nums1[m];
            
            m--;
        }
            k--;
        }
      
    
        
        
        
        
        
        
        
        
        
    }
    
}