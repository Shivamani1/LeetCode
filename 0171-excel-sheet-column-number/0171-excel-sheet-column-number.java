class Solution {
    public int titleToNumber(String columnTitle) {
        int c=0,x=columnTitle.length()-1;
        for(int i=0;i<columnTitle.length();i++){
          
            c+=(columnTitle.charAt(i)-'A'+1)*Math.pow(26,x);
            x--;
 
            
        }
        return c;
    }
}