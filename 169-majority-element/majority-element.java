class Solution {
    public int majorityElement(int[] nums) {
        
        if(nums.length < 3){
            return nums[0];
        }

        Arrays.sort(nums);

        int currMax = 0;
        int currVal = 0;

        int tempMax = 0;
        int tempVal = 0;
        for(int i = 0 ; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                tempMax++;
                tempVal = nums[i];
            }else{
                if(tempMax > currMax){
                    currMax = tempMax;
                    currVal = tempVal;
                     tempMax = 0;
                     tempVal = 0;
                }
            }
        }

         if(tempMax > currMax){
            currMax = tempMax;
            currVal = tempVal;
            tempMax = 0;
            tempVal = 0;
        }


        return currVal;
    }
}