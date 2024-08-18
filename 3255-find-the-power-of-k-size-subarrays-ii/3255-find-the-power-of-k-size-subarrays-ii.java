class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k==1)
            return nums;
        int arr[]=new int[nums.length-k+1];
        int c=0;
        for(int i=0;i<k-1;i++){
            if(nums[i+1]-nums[i]==1)
                c++;
            else
                c=0;
        }
        int idx=0;
        if(c==k-1)
            arr[idx++]=nums[k-1];
        else
            arr[idx++]=-1;
        // System.out.print(c);
        for(int i=k;i<nums.length;i++)  {
            if(nums[i]-nums[i-1]==1){
                if(c<k-1)
                    c++;
                if(c==k-1){
                    arr[idx++]=nums[i];
                }
                else{
                    arr[idx++]=-1;
                }
                    
                 
            }
        else{
            arr[idx++]=-1;
            c=0;
        }
            
        }
        
        return arr;
    }
}