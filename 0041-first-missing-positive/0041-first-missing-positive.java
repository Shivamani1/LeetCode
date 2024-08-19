class Solution {
    public int firstMissingPositive(int[] nums) {
        
         int n=nums.length;
            for(int i=0;i<n;i++)
                if(nums[i]<1||nums[i]>n+1)
                    nums[i]=n+2;
        
        int temp=0;
            for(int i=0;i<n;i++){
                temp=Math.abs(nums[i]);
                if(temp<n+1){
                    if(nums[temp-1]<0)
                        continue;
                    else 
                        nums[temp-1]=-nums[temp-1];
                }
        }
       
             temp=0;
             int i;
            for(i=0;i<n;i++)
                if(nums[i]>0)
                    return i+1;
                
            return n+1;
            
            
        }
        
        
        
        
        
        
        
    }
