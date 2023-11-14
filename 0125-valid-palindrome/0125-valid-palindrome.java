class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
                
        	} else{ 
                if(s.charAt(start)!=s.charAt(last)) 
        			return false;
        		
        		start++;
        		last--;
        	}
        }
        
        return true;
    }
}

