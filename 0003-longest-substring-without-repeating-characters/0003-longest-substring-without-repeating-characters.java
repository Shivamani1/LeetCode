class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        String finalStr="";
        String str="",t="";
        int i,j;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                 t=t+s.charAt(j);
                if(!str.contains(t))
                    str=str+s.charAt(j);
                else 
                    break;
                    t="";
            }
            if(finalStr.length()<str.length())
                finalStr=str;
            str="";
            t="";
        }
        return finalStr.length();
        
        
    }
}