class Solution {
    public boolean validPartition(int[] nums) {
              boolean[] dp =new boolean[nums.length];
       return checkPossible(0, nums,dp);
    }

    private static boolean checkPossible(int i, int[] nums,boolean[] dp) {
 
             if (i == nums.length) return true;

         if( (i < nums.length-1 && dp[i+1] == true) && ( i < nums.length -2 &&  dp[i+2]== true) ){
               return false;
        }


        if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            dp[i+1] = !checkPossible(i + 2, nums,dp);
            if(dp[i+1] == false){
                return  true;
            }else if (i < nums.length - 2 && nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]){
                    dp[i+2] =  !checkPossible(i + 3, nums,dp);
                    return  !dp[i+2];
                } else return false;


        }else if (i < nums.length - 2 && nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i + 2] - 1) {
            dp[i+2] =  !checkPossible(i + 3, nums,dp);
            return  !dp[i+2];
        } else return false;


    }

}