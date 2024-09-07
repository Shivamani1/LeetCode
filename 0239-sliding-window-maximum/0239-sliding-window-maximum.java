class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int ans[]=new int[n-k+1];
        int idx=0;
        Deque<Integer> dq=new ArrayDeque();
        for(int i=0;i<k;i++){
            int ele=arr[i];
            
          
                while(!dq.isEmpty()&&ele>dq.peekLast())
                    dq.pollLast();
           
           
                dq.addLast(ele);
            }
        ans[idx++]=dq.peekFirst();
        for(int i=k;i<n;i++){
            int ele=arr[i];
            while(!dq.isEmpty()&&ele>dq.peekLast())
                dq.pollLast();
            dq.addLast(ele);
            if(arr[i-k]==dq.peekFirst())
                dq.pollFirst();
            ans[idx++]=dq.peekFirst();
        }
        return ans;
    }
}