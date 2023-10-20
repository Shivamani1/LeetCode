
class Solution {
    public String reverseWords(String s) {
       String[] s1=new String[100];
        String str="";
        s1=s.split("\\s+");
        for(int i=s1.length-1;i>=0;i--)
        str=str+s1[i].trim()+" ";
         
                        
        return str.trim();
}}