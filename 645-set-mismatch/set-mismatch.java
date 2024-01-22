class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int duplicate = 0;

        int[] dp = new int[nums.length+1];

        for(int i = 0 ; i < nums.length; i++){

            if(dp[nums[i]] == 0 ){
                dp[nums[i]] = 1;
            }else duplicate = nums[i];

            sum += nums[i];
        }
        
        int trueSum = (n * (n + 1)) / 2;

        int missing = trueSum - (sum - duplicate);

        

        return new int[]{duplicate,missing};
    }
}

