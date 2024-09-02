class Solution {
    
    public int chalkReplacer(int[] chalk, int k) {
    
    int[] dp = new int[chalk.length];

    int sum = 0;
    for(int i = 0 ; i < chalk.length; i++){
        sum = sum + chalk[i];
        dp[i] = sum;

        if(sum > k ){
            return i;
        }

    }

    int rem = k % sum;

    if( rem == 0 ){
        return 0;
    }

    for(int i = 0 ; i < dp.length; i++){
        if(dp[i] > rem){
            return i;
        }
    }

    return 0;


    }
}