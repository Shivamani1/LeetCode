class Solution {
int arr[];
Random rand;
    public Solution(int[] nums) {
        arr=nums;
        rand=new Random();
    }
    
    public int[] reset() {
        return arr;
    }
    
    public int[] shuffle() {
        int[] a=arr.clone();
        for(int i=0;i<arr.length;i++){
            int j=rand.nextInt(i+1);
            swap(a,i,j);
        }
        
      return a;
    }
     void swap(int a[],int i,int j){
           int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
       }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */