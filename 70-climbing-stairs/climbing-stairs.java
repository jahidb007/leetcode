class Solution {
    public int[] dp = new int[46];
    public int climbStairs(int n) {
        

        if(n == 1) return 1;
        if(n == 2) return 2;
     return getResult(n - 1 ) + getResult(n - 2);   
    }

    public int getResult(int n){
        if(dp[n] != 0){
            return dp[n];
        }

        if(n == 1) return 1;
        if(n == 2) return 2;

        dp[n] = getResult(n - 1) + getResult(n - 2);
        return dp[n];
    }
}