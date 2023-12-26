class Solution {
     final static int mod = (int) Math.pow(10, 9) + 7;

    public int numRollsToTarget(int n, int k, int target) {

        int result = 0;

        int[][] dp = new int[n][target];

        for(int i = 0 ; i < n ; i++){
            Arrays.fill(dp[i], -1);
        }


        for(int i = 1; i <= k ; i++){
            result = (result + rollRec(n - 1, k, target - i, dp))% mod; ;
        }

        return result;
    }

    public int rollRec(int n, int k, int target,int[][] dp){
         if(target < 0){
            return 0;
        }

        if(n == 0 && target == 0 ){
            return 1;
        }

        if(n == 0 && target > 0){
            return 0;
        }


            if(dp[n][target] != -1){
                return dp[n][target];
            }



        int result = 0;

        for(int i = 1; i <= k ; i++){
             if (target < i) break;
            result = (result + rollRec(n - 1, k, target - i, dp)) % mod;
        }


        dp[n][target] = result % mod;
        
        return dp[n][target];

    }
}