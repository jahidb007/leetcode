class Solution {

    int[] dp;
    public int rob(int[] nums) {

        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        
        if(0 >= nums.length) return 0;
        if(0 == nums.length -1 ) return nums[0];

        int f = nums[0] + getOthers(2, nums);
        int s = nums[1] + getOthers(3, nums);

      //  System.out.println(Arrays.toString(dp));

        return Math.max(f,s);
    }

    public int getOthers(int n, int[] nums){
        if(n >= nums.length) return 0;
        if(n == nums.length -1 ) return dp[n] = nums[n];

        if(dp[n] != -1 && dp[n+1] != -1){
            return Math.max(dp[n], dp[n+1]);
        }

        dp[n] = nums[n] + getOthers(n+2, nums);
        dp[n+1] = nums[n+1] + getOthers(n+3, nums);

        return Math.max(dp[n],dp[n+1]);

    }
}

