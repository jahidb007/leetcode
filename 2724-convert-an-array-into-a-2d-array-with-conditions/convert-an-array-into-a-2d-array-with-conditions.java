class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       int[] map = new int[nums.length + 1];

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList());
        
        for(int i = 0 ; i < nums.length; i++){

            if(map[nums[i]] != 0){
                int j =map[nums[i]];
                if(list.size() < j + 1){
                    list.add(new ArrayList());
                }
                list.get(j).add(nums[i]);

               map[nums[i]] = j + 1;
            }else{
                 map[nums[i]] = 1;

                list.get(0).add(nums[i]);

            }


        }
        return list;
    }
}