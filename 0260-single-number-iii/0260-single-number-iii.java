class Solution {
    public int[] singleNumber(int[] nums) {
             HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i:nums){
           if(!map.containsKey(i)) 
           map.put(i,1);
        else {
            c=map.get(i);
            c++;
            map.put(i,c);
        }
        }
        c=0;
        int a[]=new int[2];
         for(Map.Entry<Integer,Integer> m:map.entrySet())
            if(m.getValue()==1)
                a[c++]=m.getKey();
        
       
        return a;
        
    }
}