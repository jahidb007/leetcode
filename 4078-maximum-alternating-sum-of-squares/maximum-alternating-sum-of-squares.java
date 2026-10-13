class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i  = 0 ; i < nums.length;  i++){
            if(nums[i] < 0){
                nums[i] = nums[i] * -1;
            }
        }


        Arrays.sort(nums);

        int i = 0;
        int j = nums.length-1;
        long result = 0;
        while(i < j){
            result = result + (long) nums[j] * nums[j] - (long) nums[i] * nums[i];
            i++;
            j--;
        }

        if(nums.length % 2 != 0){
            result = result + (long) nums[nums.length/2] * nums[nums.length/2];
        }

        return result;
    }
}