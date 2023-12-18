class Solution {
    public int maxProductDifference(int[] nums) {
        int maxA = -1;
        int maxB = -1;
        int minA = 10000;
        int minB = 10000;

        for(int i = 0 ; i < nums.length ; i++){
            if(maxA <= nums[i]){
                maxB = maxA;
                maxA = nums[i];
            }else if(maxB <= nums[i]){
                maxB = nums[i];
            }

            if(minA >= nums[i]){
                minB = minA;
                minA = nums[i];
            }else if(minB >= nums[i]){
                minB = nums[i];
            }
        }
        System.gc();
        return (maxA * maxB) - (minA * minB);
    }
}