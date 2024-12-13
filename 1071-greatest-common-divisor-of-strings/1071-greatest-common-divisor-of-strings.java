class Solution {
    public String gcdOfStrings(String str1, String str2) {
    if(str1.equals("")||str2.equals(""))
        return "";
        
    int a=gcd(str1.length(),str2.length());
    String s = str1.substring(0,a);

        int j=0;
    for(int i=0;i<str1.length();i++){
        if(j==a){
            j=0;
        }
        if(s.charAt(j)!=str1.charAt(i))
            return "";
        j++;
    }

        j=0;
        for(int i=0;i<str2.length();i++){
        if(j==a){
            j=0;
        }
        if(s.charAt(j)!=str2.charAt(i))
            return "";
            j++;
    }
        
        return s;
    }
    int gcd(int a,int b){
        if(b==0)
            return a;
            
        return gcd(b,a%b);
        
    }
}