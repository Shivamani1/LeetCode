class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb= new StringBuilder();
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(isVow(ch))
                sb.append(ch);
        }
        String temp=sb.reverse().toString();
        int idx=0;
         for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(isVow(ch))
                arr[i]=temp.charAt(idx++);
        }
        return new String(arr);
        
    }
    boolean isVow(char ch){
        return "AaeEiIoOuU".indexOf(String.valueOf(ch))>-1;
    }
}