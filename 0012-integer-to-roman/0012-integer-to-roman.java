class Solution {
    LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
     
     Solution(){
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400, "CD");
        map.put(100,"C");
        map.put(90, "XC");
        map.put(50,"L");
        map.put(40, "XL");
        map.put(10,"X");
        map.put(9, "IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");   
     }
    
    public String intToRoman(int num) {
      String s="";
        for(int i:map.keySet()){
           
            while(num>=i){
              s+=map.get(i);
             num-=i;
                
            }
        }
            
            
        
        return s;
    }
}