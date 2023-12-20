class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length < 3){
            return nums.length;
        }

        int index = 1;

        int match = 0;

        int lv = nums[0];

        for(int i = 1; i < nums.length; i++ ){

            if( lv == nums[i] && match == 0){
                nums[index] = nums[i];
                index++;
                match++;
            }else if( lv != nums[i]){
                nums[index] = nums[i];
                index++;
                match = 0;
                lv = nums[i];
            }

        }

        return index;

    }
}