class Solution {
    int[] dp;
    public int[] dailyTemperatures(int[] temperatures) {
        dp = new int[temperatures.length];

        for(int i = 0 ; i < temperatures.length - 1; i++){

            if(i>0 && temperatures[i] >= temperatures[i-1] && dp[i-1] == 0){
                dp[i] = 0;
            }else if(i>0 && temperatures[i] == temperatures[i-1]){
                dp[i] = dp[i-1] -1;
            }else{
                for(int j = i+1; j < temperatures.length; j++){
                if(temperatures[i] < temperatures[j]){
                    dp[i] = j - i;
                    break;
                }
            }
            }

            
        }

        return dp;
    }

    public int getNextDayResult(int i,int[] temperatures){
        if(dp[i] != -1) return dp[i];

        if(i == temperatures.length -1){
            dp[i] = 0;
            return 0;
        }

        if(temperatures[i] < temperatures[i+1]){
            dp[i] = 1;
            return 1;
        }else{
             dp[i] = getNextDayResult(i+1,temperatures) == 0 ? 0 : dp[i+1] + 1;
             return dp[i];
        }
    }
}