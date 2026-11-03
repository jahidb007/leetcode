class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int average = nums[nums.length/2];

        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > average){
                count += nums[i] - average;
            } else count += average - nums[i];
        }

        return count;
    }
}