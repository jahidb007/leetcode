class Solution {
    public long minimumReplacement(int[] nums) {
         if(nums.length == 1){
            return 0;
        }

        long count = 0;
        int next = nums[nums.length-1];
        int prev = 0;
        for(int i = nums.length-2; i >= 0 ; i--){
         prev = nums[i];

         if(prev > next){

                 int div = prev / next;
                 int haveRem = prev % next == 0 ?  0 : 1;
                 if(haveRem == 0 ){
                     count = count + div - 1;
                 }else count = count + div;

                 next = prev / (div + haveRem);

         }else next = prev;

        }



        return count;
    }
}