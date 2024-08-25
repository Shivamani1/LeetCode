class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
          int rows = mat.length;
        int cols = mat[0].length;

        int i = 0; 
        int j = cols - 1;
            int prev=j;
            int idx=0;
        for(int arr[]:mat)
            Arrays.sort(arr);
        while (i < rows && j >= 0) {
           if(mat[i][j]==1)
               j--;
            else
                i++;
            if(prev!=j){
                idx=i;
                prev=j;
            }
                
        }
        int arr[]=new int[2];
        arr[1]=cols-prev-1;
        arr[0]=idx;
        return arr; 
    }
}