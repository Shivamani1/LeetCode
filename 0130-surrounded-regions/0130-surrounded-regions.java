class Solution {
    
    void dfs(int i,int j,char[][] board,boolean[][] vis){
        if(i<0||j<0||i>=board.length||j>=board[0].length||vis[i][j]==true||board[i][j]=='X'){
            return;
        }
    
        vis[i][j]=true;
        board[i][j]='1';
        dfs(i-1,j,board,vis);
        dfs(i,j-1,board,vis);
        dfs(i+1,j,board,vis);
        dfs(i,j+1,board,vis);
        
        
        
    }
    public void solve(char[][] board) {
    boolean vis[][]=new boolean[board.length][board[0].length];
        int m=board.length;
        int n=board[0].length;
        
            for(int i=0;i<n;i++)
             if(board[0][i]=='O'){
              board[0][i]='1';
                 dfs(0,i,board,vis); 
            }
            
            for(int i=0;i<m;i++)
            if(board[i][0]=='O'){
               board[i][0]='1'; 
                 dfs(i,0,board,vis);
            }
                
            for(int i=1;i<n-1;i++)
            if(board[m-1][i]=='O'){
               board[m-1][i]='1'; 
                 dfs(m-1,i,board,vis);
            }
               
            for(int i=1;i<m;i++)
            if(board[i][n-1]=='O'){
              board[i][n-1]='1'; 
                 dfs(i,n-1,board,vis);
            }
               
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')
                   board[i][j]='X';
                else if(board[i][j]=='1')
                  board[i][j]='O' ; 
                     
            }}   
        
        
    }
}