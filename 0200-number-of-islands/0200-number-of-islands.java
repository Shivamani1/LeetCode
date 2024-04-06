class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    bfs(i,j,grid);
                }
            }
        }
       
        
        return c;
        
    }
 
       void bfs(int i,int j,char arr[][]){
            if(i<0||j<0||i>=arr.length||j>=arr[0].length||arr[i][j]=='0'){
                return;
            }
            arr[i][j]='0';
            bfs(i-1,j,arr);
            bfs(i+1,j,arr);
            bfs(i,j-1,arr);
            bfs(i,j+1,arr);
            
        }
        }