class Solution {
            static boolean arr[];
    public int nonSpecialCount(int l, int r) {
        int p=(int)Math.ceil(Math.sqrt(l));
        int q=(int)Math.ceil(Math.sqrt(r));
            createBooleanArray(q);
            int c=0;
            if(q*q==r)
                q++;
            for(int i=p;i<q;i++){
                if(arr[i])
                    c++;
            }
             return r-l+1-c;
    }
     private static void createBooleanArray(int r) {
           arr=new boolean[r+1];
             Arrays.fill(arr,true);
             arr[0]=false;
             arr[1]=false;
             for(int i=2;i<=(int)Math.sqrt(r);i++){
                if(arr[i])
                for(int j=i*i;j<=r;j=j+i){
                    arr[j]=false;
                }
            }
        }
}