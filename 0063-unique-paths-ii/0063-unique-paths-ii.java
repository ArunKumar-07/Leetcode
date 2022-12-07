class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n =obstacleGrid[0].length;
        
        int[][] dp = new int[m][n];
        for(int[] no : dp){
            Arrays.fill(no,-1);
        }
        return findPath(obstacleGrid,0,0,m,n,dp);
    }
    static int findPath(int[][] arr, int i , int  j , int m , int n,int[][] dp){
          if(i >=m || j >= n || arr[i][j]==1 ) return 0;
          if(i==m-1 &&  j==n-1 ) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
      int process=findPath(arr,i,j+1,m,n,dp);
      int unProcess=findPath(arr,i+1,j,m,n,dp);
      return  dp[i][j]=process+unProcess;


    }
}