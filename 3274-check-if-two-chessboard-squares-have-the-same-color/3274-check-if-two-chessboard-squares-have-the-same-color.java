class Solution {
    public boolean checkTwoChessboards(String s1, String s2) {
        int a=Character.getNumericValue(s1.charAt(1));
        int b=Character.getNumericValue(s2.charAt(1));
        String astr=String.valueOf(s1.charAt(0));
         String bstr=String.valueOf(s2.charAt(0));
        String odd="aceg";
        String even="bdfh";
        if(odd.indexOf(astr)!=-1&&odd.indexOf(bstr)!=-1)
            return(a%2==b%2);
        else if( even.indexOf(astr)!=-1&&even.indexOf(bstr)!=-1)
            return(a%2==b%2);
        else if( even.indexOf(astr)!=-1&&odd.indexOf(bstr)!=-1)
            return(a%2!=b%2);
     
            return(a%2!=b%2);

            

                

    }
}