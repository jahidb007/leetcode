class Solution {
    public int lengthOfLIS(int[] nums) {

        int l = nums.length;
        int[] dp  = new int[l];

        int count = 1;

        for(int i = 0 ; i < l-1 ; i++){

            if(count > l -1 - i){
                break;
            }

            if(dp[i] != 0){
                count = Math.max(count, dp[i]);
                continue;
            }
         for(int j = i+1; j < l ; j++){

             if(nums[i] < nums[j]){
                 count = Math.max(count,1 + counter(j, nums, dp));
             }

         }   
        }

        return count;
        
    }

    public int counter(int idx, int[] nums, int[] dp){

        if(idx == nums.length -1 ) return 1;

        if(dp[idx] != 0){
            return dp[idx];
        }

        int c = 1;
        for(int j = idx+1; j < nums.length; j++){
            if(nums[idx] < nums[j]){
                c = Math.max(c, 1 + counter(j, nums, dp));
            }
        }

        dp[idx] = c;

        return c;
    }
}

