class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
 
        if(obstacleGrid[0][0] == 1){
            return 0;
        }      
       
       
        if (obstacleGrid.length == 1 && obstacleGrid[0].length == 1) {
            if (obstacleGrid[0][0] == 0) {
                return 1;
            } else return 0;
        }

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        dp[0][0] = dp[0][0] + calculateDP(0, 1, dp, obstacleGrid);

        dp[0][0] = dp[0][0] + calculateDP(1, 0, dp, obstacleGrid);

        return dp[0][0];
    }

  private  int calculateDP(int i, int j, int[][] dp, int[][] obstacleGrid) {

        if (i == obstacleGrid.length || j == obstacleGrid[0].length || obstacleGrid[i][j] == 1) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }


        if (i == obstacleGrid.length - 1 && j == obstacleGrid[0].length - 1) {
            return 1;
        } else {
            dp[i][j] = dp[i][j] + calculateDP(i + 1, j, dp, obstacleGrid);
            dp[i][j] = dp[i][j] + calculateDP(i, j + 1, dp, obstacleGrid);
        }

        return dp[i][j];

    }

}