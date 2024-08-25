class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=ColBS(matrix,target,0,matrix.length-1);
        // System.out.println(n);
        return RowBS(matrix,target,0,matrix[0].length-1,n);
    
        
    }
    static int ColBS(int arr[][],int target,int l,int h){
        int ans=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid][0]<target){
                l=mid+1;
                ans=mid;
            }
            else if(arr[mid][0]>target)
                h=mid-1;
            else
                return mid;
        }
        return ans;
    }
    static boolean RowBS(int arr[][],int target,int l,int h,int i){
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[i][mid]<target)
                l=mid+1;
            else if(arr[i][mid]>target)
                h=mid-1;
            else
                return true;
        }
        return false;
        
        
        
    }
    
    
    
    
    
    
}