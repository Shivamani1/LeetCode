class Solution {
    public void reverseString(char[] s) {
        int f=0;
        int l=s.length-1;
        char ch;
       while(f<=l){
           ch=s[f];
           s[f]=s[l];
           s[l]=ch;   
           f++;
           l--;
       } 
        
    }
}