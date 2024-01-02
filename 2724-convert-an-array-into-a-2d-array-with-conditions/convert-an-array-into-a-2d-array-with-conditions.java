class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       int[] map = new int[nums.length + 1];

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList());
        
        for(int i = 0 ; i < nums.length; i++){
            
            if(list.size() <= map[nums[i]]){
                list.add(new ArrayList());
            }

            list.get(map[nums[i]]).add(nums[i]);
            map[nums[i]]++;
        }

        return list;
    }
}