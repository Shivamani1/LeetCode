import java.util.Arrays;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long c=0;
      Arrays.sort(happiness);
        int a=0;
        int i=happiness.length-1;
        for(;i>=0;i--){
            if(happiness[i]-a>0&&a<k){
                c+=happiness[i]-a;
            }
            else
                break;
            a++;
            
        }
       
        return c;
        
        
    }
}