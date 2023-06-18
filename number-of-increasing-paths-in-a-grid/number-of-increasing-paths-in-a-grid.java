class Solution {
    int mod = (int)(1e9+7);
    public int countPaths(int[][] grid) {
            int m = grid.length;
        int n = grid[0].length;
        int[][] calculatedPath = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                calculatePath(i,j,m,n,grid,calculatedPath);
            }
        }

        int totalPath = m * n;
        for(int i = 0 ; i < m ; i++){
            for( int j = 0 ; j < n ; j++){
                totalPath = (totalPath + calculatedPath[i][j])%mod;
            }
        }

        return totalPath;
    }

    private int calculatePath(int i, int j,int m, int n,int[][] grid,int[][] calculatedPath) {
     
        int totalPath = 0;
        if(i<0  || j < 0 || i >= m || j >= n ){
            return 0;
        }

        if(calculatedPath[i][j] != 0){
            return calculatedPath[i][j];
        }

        // calculate left

        if(j>0){
            if(grid[i][j-1] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath + calculatePath(i,j-1,m,n,grid,calculatedPath))%mod;
            }

        }


        // calculate right
        if(j<n-1){
            if(grid[i][j+1] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i,j+1,m,n,grid,calculatedPath))%mod;
            }
        }


        //calculate up
        if(i>0){
            if(grid[i-1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i-1,j,m,n,grid,calculatedPath))%mod;
            }
        }


        //calculate down
        if(i<m-1){
            if(grid[i+1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i+1,j,m,n,grid,calculatedPath))%mod;
            }
        }


        calculatedPath[i][j] = (int) totalPath;
        return totalPath;
    }
}