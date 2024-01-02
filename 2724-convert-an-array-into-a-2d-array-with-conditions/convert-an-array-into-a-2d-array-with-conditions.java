class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       int[] map = new int[nums.length + 1];

        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length; i++){
            
            int j = map[nums[i]];
            
            if(list.size() <= j){
                list.add(new ArrayList());
            }

            list.get(j).add(nums[i]);
            map[nums[i]] = j + 1;
        }

        return list;
    }
}