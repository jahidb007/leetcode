class Solution {
    public int minimizeSum(int[] nums) {
        int l = nums.length;
        if(nums.length <4){
            return 0;
        }

        Arrays.sort(nums);

        int f = nums[l-1] - nums[2];
        int s = nums[l-3] - nums[0];
        int t = nums[l-2] - nums[1];

        return Math.min(f, Math.min(s,t));

    }
}
/*
59,27,9,81,33
9,27,33,59,81
24,6,0,26,48
24,6,0,0,0


58,42,8,75,28
8,28,42,58,75
32,14,0,16,33
0,14,0,16,0
*/