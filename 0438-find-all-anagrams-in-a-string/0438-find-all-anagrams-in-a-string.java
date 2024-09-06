class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList();
        if(p.length()>s.length())
            return l;
        int pArr[]=new int[26];
        int sArr[]=new int[26];
        
        for(int i=0;i<p.length();i++){
            pArr[p.charAt(i)-'a']++; 
            sArr[s.charAt(i)-'a']++;
        }  
        if(Arrays.equals(sArr,pArr))
            l.add(0);
        int k=p.length();
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            sArr[ch-'a']++;
            sArr[s.charAt(i-k)-'a']--;
            if(Arrays.equals(sArr,pArr))
                l.add(i-k+1);
            
        }
        return l;
    }
}