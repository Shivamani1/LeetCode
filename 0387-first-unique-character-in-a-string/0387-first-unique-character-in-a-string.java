class Solution {
    public int firstUniqChar(String s) {
        int i;
        for( i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String s1=Character.toString(ch);
            if(s.indexOf(s1)==s.lastIndexOf(s1))
                return i;
            
        }
        return -1;
    }
}