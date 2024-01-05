class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap();

        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else map.put(nums[i], 1);
        }

        int op = 0;
       
       
       for (int value : map.values()) {
         if(value < 2){
             return -1;
         }

         op += value /3;
         if( value % 3 != 0){
             op++;
         }
    }

        return op;
    }
}