class Solution {
    int mod = (int)(1e9+7);
     int[][] calculatedPath;
    public int countPaths(int[][] grid) {
            int m = grid.length;
        int n = grid[0].length;
       calculatedPath = new int[m][n];
 int[] result = new int[1];
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                calculatePath(i,j,m,n,grid,result);
            }
        }

       return result[0] + (m * n);
    }

   private  int calculatePath(int i, int j,int m, int n,int[][] grid,int[] result) {
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
                totalPath = (totalPath + calculatePath(i,j-1,m,n,grid,result))%mod;
            }

        }


        // calculate right
        if(j<n-1){
            if(grid[i][j+1] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i,j+1,m,n,grid,result))%mod;
            }
        }


        //calculate up
        if(i>0){
            if(grid[i-1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i-1,j,m,n,grid,result))%mod;
            }
        }


        //calculate down
        if(i<m-1){
            if(grid[i+1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i+1,j,m,n,grid,result))%mod;
            }
        }


        calculatedPath[i][j] = (int) totalPath;
        result[0] = (result[0] + totalPath)%mod;
        return totalPath;
    }
}