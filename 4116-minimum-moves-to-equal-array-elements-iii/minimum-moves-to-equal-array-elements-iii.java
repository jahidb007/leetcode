class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int l = nums.length;
        for(int i = 0 ; i < l - 1; i++){
            count += nums[l-1] - nums[i];
        }

        return count;
    }
}