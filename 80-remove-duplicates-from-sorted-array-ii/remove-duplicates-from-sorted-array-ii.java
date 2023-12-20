class Solution {
    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        if(len < 3){
            return len;
        }

        int index = 1;

        int match = 0;

        for(int i = 1; i < len; i++ ){

            if( nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
                match = 0;
            }else if( match == 0){
                nums[index] = nums[i];
                index++;
                match++;
            }

        }

        return index;

    }
}