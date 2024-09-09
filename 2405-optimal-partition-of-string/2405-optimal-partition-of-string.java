class Solution {
    public int partitionString(String s) {
      HashSet<Character> set=new HashSet();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                set=new HashSet();
                c++;
            }
            set.add(ch);
        }
        return c+1;
    }
}