class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int c=0,n=colors.length;
        for(int i=0;i<n;i++){
            if(i==0&&(colors[n-1]!=colors[0]&&colors[0]!=colors[1]))
                c++;
           else if(i==n-1&&(colors[n-1]!=colors[0]&&colors[n-1]!=colors[n-2]))
                c++;
            else if(i!=0&&i!=(n-1)&&colors[i]!=colors[i-1]&&colors[i]!=colors[i+1])
                c++;
        }
        return c;
        
        
        
    }
}