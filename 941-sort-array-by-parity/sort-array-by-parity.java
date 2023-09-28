class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
            int[] res = new int[nums.length];
            int e = 0;
            int o = nums.length - 1;
            int p = 0;

            while( p < nums.length){

                if(nums[p] % 2 == 0){
                    res[e] = nums[p];
                    e++;
                }else{
                    res[o] = nums[p];
                    o--;
                }

                p++;
            }


        return res;
    }
}