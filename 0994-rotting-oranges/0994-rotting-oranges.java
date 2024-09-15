class Solution {
    public int orangesRotting(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1)
                    fresh++;
                else if(arr[i][j]==2)
                    q.add(new int[]{i,j});
            }
        }
        int minutes=0;
        while(!q.isEmpty()){
            int size=q.size();
            boolean boo=false;
            for(int i=0;i<size;i++){
                int[] rotten=q.poll();
                int x=rotten[0];
                int y=rotten[1];
                if(y<n-1&&arr[x][y+1]==1){
                    q.add(new int[]{x,y+1});
                    arr[x][y+1]=2;
                    fresh--;
                    boo=true;
                }
               if(x>0&&arr[x-1][y]==1){
                    q.add(new int[]{x-1,y});
                    arr[x-1][y]=2;
                    fresh--;
                    boo=true;
                }
                if(y>0&&arr[x][y-1]==1){
                    q.add(new int[]{x,y-1});
                    arr[x][y-1]=2;
                    fresh--;
                    boo=true;
                }
                if(x<m-1&&arr[x+1][y]==1){
                    q.add(new int[]{x+1,y});
                    arr[x+1][y]=2;
                    fresh--;
                    boo=true;
                }   
            }
            if(boo)
                minutes++;
        }
        if(fresh!=0)
            return -1;
        return minutes;
        
        
        
        
    }
}