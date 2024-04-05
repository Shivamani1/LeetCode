class Solution {


    public String largestNumber(int[] nums) {

        Integer[] arr=new Integer[nums.length];
        int idx=0;
        for(int i:nums)
            arr[idx++]=i;            
        
        
Comparator<Integer> comp = new Comparator<Integer>() {
    @Override
    public int compare(Integer a, Integer b) {
   
         String xy = a.toString() + b.toString();
        String yx = b.toString() + a.toString();
        
        return yx.compareTo(xy);
    }
};
        Arrays.sort(arr,comp);
        String s="";
        int c=0;
        for(Integer i:arr){
            if(i==0)
                c++;
          s+=String.valueOf(i);  
        }
        if(c==arr.length)
            s="0";
       return s; 
    }
}