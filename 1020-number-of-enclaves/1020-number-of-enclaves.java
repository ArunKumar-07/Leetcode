class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        for( int i=0;i<m;i++){
            if(grid[0][i]==1)
                dfs(grid,0,i);
            if(grid[n-1][i]==1)
                dfs(grid,n-1,i);
        }
        for( int j=0;j<n;j++){
            if(grid[j][0]==1)
                dfs(grid,j,0);
            if(grid[j][m-1]==1)
                dfs(grid,j,m-1);
        }
        for( int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
        
    }
    private void dfs(int[][] grid,int i,int j){
        if(i <0 || j <0 || i>=grid.length || j >=grid[0].length ||  grid[i][j]==0) return ;
        
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        
    }
}