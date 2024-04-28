class Solution {
    public int hIndex(int[] citations) {
        int h= citations.length;
        int arr[]=new int[h+1];
        for(int i=0;i<h;i++){
            if(citations[i]>=h){
                arr[h]++;
            }
            else{
                if(citations[i]>0)
                arr[citations[i]]++;
            }
            
            
        }
        if(arr[h]>=h)
            return h;
        for(int i=h-1;i>0;i--){
            arr[i]+=arr[i+1];
            if(arr[i]>=i)
                return i;
            
        }
           
        
        return 0;
    }
}