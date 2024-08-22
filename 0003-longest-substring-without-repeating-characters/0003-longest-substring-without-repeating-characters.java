
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int count[]=new int[26];
        int idx=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!hm.containsKey(ch)){
               hm.put(ch,i);
            }
            else{
                if(hm.get(ch)+1>idx)
                idx=hm.get(ch)+1;
                hm.put(ch,i);
            }
            max=Math.max(max,i-idx+1);
            // System.out.println(hm.get(ch)+" "+idx);
        }
        return max;
        
        
    }
}