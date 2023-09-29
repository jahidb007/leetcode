class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean res = true;
        int mon = 0;
        for(int i = 0 ; i < nums.length -1 ; i++){

            if(nums[i] == nums[i+1]){
                continue;
            }


            if(nums[i] < nums[i+1] && mon > 0){
                return false;
            }else if (nums[i] < nums[i+1] && mon == 0) mon = -1;

            if(nums[i] > nums[i+1] && mon < 0){
                return false;
            } else if (nums[i] > nums[i+1] && mon == 0) mon = 1;



        }

return res;
    }
}