class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        for(int[] a:grid){
            String temp=Arrays.toString(a);
            hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        int c=0;
        int m=grid.length;
        int n =grid[0].length;
        for(int i=0;i<n;i++){
            int arr[]=new int[m];
            for(int j=0;j<m;j++){
                arr[j]=grid[j][i];
            }
            c+=hm.getOrDefault(Arrays.toString(arr),0);
            
        }
        
        
        return c;
    }
}