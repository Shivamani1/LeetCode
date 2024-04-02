class Solution {

       
      
    
    public int numSquares(int n) {
        int x=(int)Math.sqrt(n);
      int[] arr=new int[x];
      int[] dp=new int[n+1]; 
        for(int i=1;i<=Math.sqrt(n);i++)
            arr[i-1]=i*i;
        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j:arr){
                if(j<=i&&dp[i-j]!=Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i],dp[i-j]+1);
                
            }

        }
     return dp[n];
    
    }
}