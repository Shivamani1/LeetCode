class Solution {
    public int compress(char[] chars) {
        int curC=0;
        char prev = chars[0];
        int idx=0;
        for(int i=0;i<chars.length;i++){
            char cur = chars[i];
            if(cur==prev){
                curC++;
            }else if(curC==1){
              chars[idx++]=prev;
            }
            else{
                chars[idx++]=prev;
                String s = String.valueOf(curC);
                int j=0;
                while(j<s.length())
                chars[idx++]=(char)s.charAt(j++);
                curC=1;
            }
            prev = cur;
        }
        if(curC==1)
              chars[idx++]=prev;
        else{
                chars[idx++]=prev;
                String s = String.valueOf(curC);
                int j=0;
                while(j<s.length())
                chars[idx++]=s.charAt(j++);
                curC=1;
            }
        System.out.println(idx);
        return idx;
    }
}