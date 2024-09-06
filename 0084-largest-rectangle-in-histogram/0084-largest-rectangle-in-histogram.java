class Solution {
    public int largestRectangleArea(int[] arr) {
            int n=arr.length;
            int ls[]=new int[n];
            int rs[]=new int[n];
            ls=leftSmall(ls,arr,n);
            rs=rightSmall(rs,arr,n);
            int area=0;
            for(int i=0;i<n;i++){
                area=Math.max(area,(rs[i]-ls[i]-1)*arr[i]);
            }
            return area;

    }
    static int[] leftSmall(int[] ls,int[] arr,int n){
          Arrays.fill(ls,-1);
            Stack<Integer> st=new Stack();
            for(int i=n-1;i>=0;i--){
                int ele=arr[i];
                while(!st.isEmpty()&&arr[st.peek()]>ele){
                    ls[st.pop()]=i;//we need index
                }
                st.push(i);
            }
            return ls;

        }
        static int[] rightSmall(int[] rs,int[] arr,int n){
            Arrays.fill(rs,n);
            Stack<Integer> st=new Stack();
            for(int i=0;i<n;i++){
                int ele=arr[i];
                while(!st.isEmpty()&&arr[st.peek()]>ele){
                    rs[st.pop()]=i;//we need index
                }
                st.push(i);
            }
            return rs;

        }
}