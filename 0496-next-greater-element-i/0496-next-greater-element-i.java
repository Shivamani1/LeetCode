class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i:nums1)
            hm.put(i,-1);
        Stack<Integer> s=new Stack<Integer>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.empty()&&s.peek()<nums2[i])
                s.pop();
            if(!s.empty()&&hm.containsKey(nums2[i]))
                hm.put(nums2[i],s.peek());
            s.push(nums2[i]);
            
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
            
        return nums1;
        
    }
}