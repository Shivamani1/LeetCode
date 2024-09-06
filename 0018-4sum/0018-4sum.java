
class Solution {
    static List<List<Integer>> ll;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ll=new ArrayList();
        helper(4,nums,new ArrayList(),0,(long)target);
        return ll;
    }
    static void helper(int k,int[] arr,List<Integer> l,int start,long target){
        if(k==2){
            twoSum(start,arr.length-1,arr,l,target);
            return;
        }
        for(int i=start;i<arr.length;i++){
            if (i > start && arr[i] == arr[i - 1]) continue;
            l.add(arr[i]);
            helper(k-1,arr,l,i+1,target-arr[i]);
            l.remove(l.size()-1);    
        }
        
    }
    static void twoSum(int l,int h,int[] arr,List<Integer> list,long target){
        while(l<h){
            long sum=(long)arr[l]+arr[h];
            if(sum<target)
                l++;
            else if(sum>target)
                h--;
            else{
                list.add(arr[l]);
                list.add(arr[h]);
                ll.add(new ArrayList(list));
                list.remove(list.size()-1);
                list.remove(list.size()-1);
                l++;
                h--;
                 while (l < h && arr[l] == arr[l - 1]) l++;
                while (l < h && arr[h] == arr[h + 1]) h--;
            }
            
        }
        return;
    }
}