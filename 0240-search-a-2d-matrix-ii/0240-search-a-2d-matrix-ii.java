class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(j>=0&&i<=matrix.length-1){
            while(j>=0&&target<matrix[i][j])
                j--;
            while(i<=matrix.length-1&&j>=0&&target>matrix[i][j])
                i++;
            if(i<=matrix.length-1&&j>=0&&matrix[i][j]==target)
                return true;
           
        }
        return false;
        
        
        
        
    }
}