class Solution {
    int[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        int l = matrix.length;
        dp = new int[l][l];

        for(int i = 0 ; i < l ; i++){
            Arrays.fill(dp[i], 10001);
        }
        
        int p = 10001;
        for(int i = 0 ; i < l ; i++){
            int m = matrix[0][i] + getDown(1,i -1,l, matrix);
            int n = matrix[0][i] + getDown(1,i ,l, matrix);
            int o = matrix[0][i] + getDown(1,i + 1,l, matrix);
            System.out.println(m + " " + n + " " +o);
            dp[0][i] =  Math.min(Math.min(m,n),o);
            System.out.println("comp "+dp[0][i] + " "+ p);
            p = Math.min(dp[0][i], p);
             System.out.println(p);
        } 

        return p;
    }

    public int getDown(int r,int i,int l, int[][] matrix){
     

        if(i < 0 || i >= l ) return 10001;
        if(r >= l ) return 0;

        if(dp[r][i] != 10001 ) return dp[r][i];

        int p = matrix[r][i] + getDown(r+1 , i - 1,l, matrix);
        int q = matrix[r][i] + getDown(r+1 ,i , l, matrix);
        int s = matrix[r][i] + getDown(r+1, i + 1,l, matrix);
      //  System.out.println("for "+ i + ""+r+ " : " + p + " "+ " "+ q + " "+ s);
      //  System.out.println( "taken " + Math.min(Math.min(p,q),s));
        return dp[r][i] = Math.min(Math.min(p,q),s);
    }
}

