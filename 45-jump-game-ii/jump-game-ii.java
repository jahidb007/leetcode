class Solution {
    public int jump(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp , Integer.MAX_VALUE);

        if(nums.length == 1){
            return 0;
            
        }

        int res = Integer.MAX_VALUE;

        for(int i = 1 ; i <= nums[0] ; i++){
         res =   Math.min(res, 1 + jumpRec(nums, i, dp));
        }
        
        return res;
    }

    public int jumpRec(int[] nums, int k, int[] dp){

        if(k >= nums.length - 1){
            return 0;
        }

        if(dp[k] != Integer.MAX_VALUE){
            return dp[k];
        }

        int res = Integer.MAX_VALUE;

        for(int i = 1 ; i <= nums[k] ; i++){
         res =   Math.min(res, 1 + jumpRec(nums, k+i ,dp));
        }

       // System.out.println( k + " "+res);
        if(res == Integer.MAX_VALUE){
            return 99999;
        }

        dp[k] = res;

        return res;

    }


}