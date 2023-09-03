class Solution {
     int[][] dp;
    public int uniquePaths(int m, int n) {
        dp   = new int[m][n];
        int result = 0;
        for(int i = 0 ; i < m ; i++){
           Arrays.fill(dp[i], -1); 
        }

        if(m == 1 && n == 1){
            return 1;
        }
        
        result = calculatePath(1,0,m,n);
        result = result + calculatePath(0,1,m,n);
        return result;
    }

   private int calculatePath(int i, int j,int m,int n){
        if(i == m-1 && j == n-1 ){
            return 1;
        }

        

        if( i == m || j == n){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
    int result = calculatePath(i+1,j,m,n);
  result = result + calculatePath(i,j+1,m,n);
    

    dp[i][j] = result;
   
    return result;
    }
}