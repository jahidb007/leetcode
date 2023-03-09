class Solution {
    public boolean containsDuplicate(int[] nums) {
     for(int i=1;i<nums.length;i++){
            int temp = nums[i];
            if(nums[i]<nums[i-1]){
                nums[i] = nums[i-1];
                nums[i-1] = temp;

                for(int k=0;k<i-1;k++){
                    if(nums[k]==temp)
                        return true;
                }

            }if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}