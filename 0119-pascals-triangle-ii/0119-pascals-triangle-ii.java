class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> jj=new ArrayList();
        int[] arr=new int[5];
        int c=0; 
        jj.add(1);
         if(rowIndex==0)
            return jj;
        for(int i=1;i<=rowIndex;i++){
                    jj.clear();
             jj.add(1);
            if(i>1)
                    for(int k=0;k<arr.length-1;k++)
                        jj.add(arr[k]+arr[k+1]);
         jj.add(1);               
             
            c=0;
             arr=new int[jj.size()];
                    for(int l:jj)
                         arr[c++]=l;
            
        }
        return jj;
        
    }
}