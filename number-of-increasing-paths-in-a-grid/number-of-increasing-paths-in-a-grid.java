class Solution {
    int mod = (int)(1e9+7);
     int[][] calculatedPath;
     int[] result = new int[1];
     int m,n;
    public int countPaths(int[][] grid) {
             m = grid.length;
         n = grid[0].length;
       calculatedPath = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                calculatePath(i,j,grid);
            }
        }

       return result[0] + (m * n);
    }

   private  int calculatePath(int i, int j,int[][] grid) {
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
                totalPath = (totalPath + calculatePath(i,j-1,grid))%mod;
            }

        }


        // calculate right
        if(j<n-1){
            if(grid[i][j+1] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i,j+1,grid))%mod;
            }
        }


        //calculate up
        if(i>0){
            if(grid[i-1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i-1,j,grid))%mod;
            }
        }


        //calculate down
        if(i<m-1){
            if(grid[i+1][j] > grid[i][j]){
                totalPath++;
                totalPath = (totalPath +  calculatePath(i+1,j,grid))%mod;
            }
        }


        calculatedPath[i][j] = (int) totalPath;
        result[0] = (result[0] + totalPath)%mod;
        return totalPath;
    }
}