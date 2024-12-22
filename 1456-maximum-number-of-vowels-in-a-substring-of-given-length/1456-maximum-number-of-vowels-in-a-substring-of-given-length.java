class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(isVow(ch))
                ans++;
        }
        int max=ans;
        for(int i=k;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVow(ch))
                ans++;
            if(isVow(s.charAt(i-k)))
                ans--;
            max=Math.max(ans,max);
        }
        return max;
    }
    boolean isVow(char ch){
        return "aeiou".indexOf(String.valueOf(ch))>=0;        
    }
}