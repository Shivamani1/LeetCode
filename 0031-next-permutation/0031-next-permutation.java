class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)
            return;
        int p2=0;
        int p1=0;
        if(nums[0]<nums[1])
            p2=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
                p2=i;
        }
       if(p2==0){
           Arrays.sort(nums,p2,nums.length);
           return;
       }
           
            p1=p2-1;
            for(int i=p2;i<nums.length;i++){
                if(nums[i]>nums[p2-1]&&nums[i]<nums[p2])
                    p1=i;
            }
            if(p1==p2-1)
                swap(nums,p1,p2);
            else
                swap(nums,p1,p2-1);
                
            Arrays.sort(nums,p2,nums.length); 
        
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}