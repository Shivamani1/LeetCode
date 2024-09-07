class Solution {
    public String minWindow(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len2>len1)
            return "";
        HashMap<Character,Integer> hs=new HashMap();
        HashMap<Character,Integer> ht=new HashMap();
        for(int i=0;i<len2;i++){
            char ch=t.charAt(i);
            ht.put(ch,ht.getOrDefault(ch,0)+1);
            hs.put(ch,0);
        }
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int c=0;
        int st=-1,end=-1;
        while(j<len1){
            char ch=s.charAt(j);
            if(hs.containsKey(ch)){
                hs.put(ch,hs.get(ch)+1);
                if(hs.get(ch).intValue() == ht.get(ch).intValue())
                    c++;
            }
            while(i<=j&&c==hs.size()){
                if(j-i+1<min){
                    st=i;
                    end=j;
                    min=j-i+1;
                }
                char temp=s.charAt(i);
                if(hs.containsKey(temp)){
                    hs.put(temp,hs.get(temp)-1);
                    if(hs.get(temp)<ht.get(temp))
                        c--;
                }
                    
                i++;
            }
            j++;       
        }
        // System.out.print(st);
        if(st==-1)
            return "";
        return s.substring(st,end+1);
    }
}