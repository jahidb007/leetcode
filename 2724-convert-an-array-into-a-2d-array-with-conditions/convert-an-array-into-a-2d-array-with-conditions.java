class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if(list.size() < j + 1){
                    list.add(new ArrayList());
                }
                list.get(j).add(nums[i]);

                map.put(nums[i], j + 1);
            }else{
                map.put(nums[i],1);

                if(list.size() < 1){
                    list.add(new ArrayList());
                }
                list.get(0).add(nums[i]);

            }


        }
        return list;
    }
}