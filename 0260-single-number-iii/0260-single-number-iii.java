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
          ArrayList<Integer> arr=new ArrayList<>();

         for(Map.Entry<Integer,Integer> m:map.entrySet())
            if(m.getValue()==1)
                arr.add(m.getKey());
        int a[]=new int[arr.size()];
        c=0;
        for(int i:arr)
            a[c++]=i;
        return a;
        
    }
}