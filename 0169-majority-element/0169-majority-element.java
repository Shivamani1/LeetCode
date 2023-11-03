class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int c;
        for(int i:nums){
            c=1;
            if(!m.containsKey(i))
            m.put(i,c);
            else{
                c=m.get(i)+1;
                if(c>nums.length/2)
                    return i;
               m.put(i,c);

            }
        }
        return nums[0];
        
    }
}