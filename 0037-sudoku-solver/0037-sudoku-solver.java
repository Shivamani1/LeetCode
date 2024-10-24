class Solution {
    public void solveSudoku(char[][] board) {
        helper(0,0,board);
    }
    static boolean helper(int row,int col,char arr[][]){
       
        int nrow;
        int ncol;
        if(col<=8){
            nrow=row;
            ncol=col;
        }
        else{
            nrow=row+1;
            ncol=0;
        }
         if(nrow==arr.length)
            return true;
        if(arr[nrow][ncol]=='.'){
            for(int i=0;i<9;i++){
                char ch=(char)('1'+i);
                if(isValid(nrow,ncol,arr,ch)){
                    arr[nrow][ncol]=ch;
                    if(helper(nrow,ncol+1,arr))
                        return true;
                    else arr[nrow][ncol]='.';
                }
            }
                 
        }
        else {
            if(helper(nrow,ncol+1,arr))
            return true;
        }
        return false;
        
    }
    static boolean isValid(int row,int col,char arr[][],char ch){
        for(int i=0;i<9;i++){
            if(arr[row][i]==ch)
                return false;
            if(arr[i][col]==ch)
                return false;
            if(arr[3*(row/3)+i/3][3*(col/3)+i%3]==ch)
                return false;
        }
        return true;
    }
}