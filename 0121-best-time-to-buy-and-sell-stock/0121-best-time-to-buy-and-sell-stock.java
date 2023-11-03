class Solution {
    public int maxProfit(int[] prices) {
        int m=Integer.MAX_VALUE;
        int c=0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<m)
                m=prices[i];
         
            if(c<prices[i]-m)
            c=prices[i]-m;
           
        }
       
        return c;
    }
}