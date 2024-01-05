class Solution {
    public int lengthOfLIS(int[] nums) {

        int l = nums.length;
        int[] dp  = new int[l];

        int count = 1;

        for(int i = 0 ; i < l-1 ; i++){
         for(int j = i+1; j < l ; j++){

             if(nums[i] < nums[j]){
                 count = Math.max(count,1 + counter(j, nums, dp, l));
             }

         }   
        }

        return count;
        
    }

    public int counter(int idx, int[] nums, int[] dp, int l){

        if(idx == l -1 ) return 1;

        if(dp[idx] != 0){
            return dp[idx];
        }

        int c = 1;
        for(int j = idx+1; j < l; j++){

            if(c > l -1 - idx){
                break;
            }

            if(nums[idx] < nums[j]){
                c = Math.max(c, 1 + counter(j, nums, dp, l));
            }
        }

        dp[idx] = c;

        return c;
    }
}

