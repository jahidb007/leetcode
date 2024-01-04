class Solution {
    public boolean canJump(int[] nums) {
       // System.out.println(nums[0] == 0 && nums.length > 1);
       // if(nums[0] == 0 && nums.length > 1) return false;

        int[] dp = new int[nums.length];

        boolean reached = false;
        if(nums[0] >= nums.length -1) return true;
            for(int j = 1 ; j <= nums[0]; j++){
                reached = canReach( j, nums, dp);
                if(reached == true) return true;
            }
            
        

        return false;
        
    }

    public boolean canReach(int pos, int[] nums, int[] dp){
         
        if(pos >= nums.length - 1) return true;
        if(pos + nums[pos] >= nums.length - 1) return true;

        if(dp[pos] == -1) return false;

        boolean reached = false;
        for(int j = 1 ; j <= nums[pos]; j++){ 
             
            reached = canReach(pos + j, nums, dp);
            if(reached == true) return true;
        }

        dp[pos] = -1;

        return reached;

    }
}