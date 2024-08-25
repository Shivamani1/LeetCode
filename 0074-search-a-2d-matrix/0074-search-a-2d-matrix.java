class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int n=matrix.length;
        int l=0;
        int h=n*m-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(matrix[mid/m][mid%m]<target)
                l=mid+1;
            else if(matrix[mid/m][mid%m]>target)
                h=mid-1;
            else
                return true;   
        }
        return false;
    }
}