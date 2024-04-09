class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long Numerator=numerator;
        long Denominator=denominator;
StringBuilder sb=new StringBuilder();
       long num=Math.abs(Numerator);
       long den=Math.abs(Denominator);
      
     // System.out.println(Numerator*Denominator);
         if(Numerator*Denominator<0){
            sb.append("-"); 
         }
         long rem=Math.abs(num%den);    
        
        if(rem==0){
        sb.append(num/den);
            return sb.toString();
        }
        sb.append(num/den);
        sb.append(".");
        List<List<Long>> l=new ArrayList();
        StringBuilder o=new StringBuilder();
        long q=0;
        while(true){
            rem=rem%den;
              if(rem==0){   
                for(int i=0;i<l.size();i++){
                    o.append(l.get(i).get(0));
                } 
                  break;
            }
            
            rem=rem*10;
            q=rem/den;
           // System.out.println(q);
            
            if(!l.contains(Arrays.asList(q,rem)))
            l.add(Arrays.asList(q,rem));
            else{
               int x = l.indexOf(Arrays.asList(q,rem));  
             
                for(int i=0;i<x;i++)
                    o.append(l.get(i).get(0));
               
                   o.append("(");
                for(int i=x;i<l.size();i++){
                    o.append(l.get(i).get(0));
                }
                 o.append(")");
                break;
                 }
            
            
            }
        
        
        
        
        sb.append(o);
        
       
       
        
        return sb.toString();
    }
}