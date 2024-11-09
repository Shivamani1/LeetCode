class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int arr[]=new int[1001];
        for(int i=0;i<nums1.length;i++){
            if(arr[nums1[i]]==0)
                arr[nums1[i]]++;
        }
        int c=0;
        for(int i=0;i<nums2.length;i++){
            if(arr[nums2[i]]==1){
                arr[nums2[i]]++;
                c++;
            }
        }
        int ans[]=new int[c];
        int idx=0;
        for(int i=0;i<1001;i++)
            if(arr[i]==2)
                ans[idx++]=i;
        return ans;
    }
}