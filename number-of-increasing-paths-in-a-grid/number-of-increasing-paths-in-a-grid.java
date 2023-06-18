class Solution {
    int mod = (int)(1e9+7);
     int[][] calculatedPath;
     int m,n;
    public int countPaths(int[][] grid) {
             m = grid.length;
         n = grid[0].length;
       calculatedPath = new int[m][n];
             int ans = 0;
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                 ans = (ans + calculatePath(i,j,grid))%mod;
            }
        }

       return ans + ( m * n);
    }

   private  int calculatePath(int i, int j,int[][] grid) {
        int totalPath = 0;
        

        if(calculatedPath[i][j] != 0){
            return calculatedPath[i][j];
        }

        // calculate left

        if(j>0 && grid[i][j-1] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath + calculatePath(i,j-1,grid))%mod;
            

        }


        // calculate right
        if(j<n-1 && grid[i][j+1] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i,j+1,grid))%mod;
            
        }


        //calculate up
        if(i>0 && grid[i-1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i-1,j,grid))%mod;
            
        }


        //calculate down
        if(i<m-1 && grid[i+1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i+1,j,grid))%mod;
            
        }


        calculatedPath[i][j] = (int) totalPath;
        return totalPath;
    }
}