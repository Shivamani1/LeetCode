class Solution {
    public boolean isAnagram(String s, String t) {
       int alph[] =new int[26];
        if(s.length()!=t.length())
          return false;
        for( int i=0;i<s.length();i++){
            alph[s.charAt(i)-'a']++;
            alph[t.charAt(i)-'a']--;
        }
        for(int i:alph)
            if(i!=0)
                return false;
        return true;
        
        
        
    }
}