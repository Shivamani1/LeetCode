class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2)
            return false;
        int arr[]=new int[26];
        
        for(int i=0;i<len1;i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        if(allZeros(arr))
            return true;
        for(int j=len1;j<len2;j++){
            arr[s2.charAt(j-len1)-'a']++;
            arr[s2.charAt(j)-'a']--;
            if(allZeros(arr))
                return true;
        }
        return false;
    }
    static boolean allZeros(int[] arr){
        for(int i=0;i<26;i++)
            if(arr[i]!=0)
                return false;
        return true;
    }
    }