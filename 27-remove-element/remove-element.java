class Solution {
    public int removeElement(int[] nums, int val) {
         int l = nums.length - 1;
        int k = 0;

        if( l == 0 && nums[0] == val){
            return 0;
        }

        for(int i = 0 ; i < nums.length ; i++){

            if(i >= l){
                if(nums[i] != val){
                    k++;
                }
                break;
            }

            if(nums[i] == val){
                //swap
                while(nums[l] == val && l > i){
                    l--;
                }
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                if(nums[i] != val){
                    k++;
                }
                l--;

            }else k++;
        }

        return k;
    }
}