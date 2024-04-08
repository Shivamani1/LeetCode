class Solution {
    public int myAtoi(String s) {
     s=s.trim();
        char ch[]=s.toCharArray();
        int flag=1,ans=0;
        boolean f=true;
        
       
        for(int i=0;i<s.length();i++){
           
             if(ch[i]=='-'&&f){
                flag=-1; 
                 f=false;
        }  
        else if(ch[i]=='+'&&f){
            flag=1;
            f=false;
        }
            else if(!Character.isDigit(ch[i]))
                break;
          else if (ans> Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && ch[i] - '0' > 7)) {
				if (flag == -1) {
					return Integer.MIN_VALUE;
				}
				return Integer.MAX_VALUE;
			}
            else{
              ans=ans*10+ch[i]-'0';   
                f=false;
            }
           
            
        }
        
        
      return flag*ans;
      
        
        
    }
}