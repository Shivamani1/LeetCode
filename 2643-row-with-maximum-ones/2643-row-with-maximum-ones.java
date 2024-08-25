class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
          int rows = mat.length;
        int cols = mat[0].length;
            int arr[]=new int[2];
        for(int i=0;i<rows;i++){
            int count=0;
            for(int j=0;j<cols;j++){
                count+=mat[i][j];
            }
            if(count>arr[1]){
                arr[1]=count;
                arr[0]=i;
            }
                
            
        }
        return arr;
    }
}