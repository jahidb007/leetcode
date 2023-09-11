class Solution {
        List<List<Integer>> groups = new ArrayList<>();

        Map<Integer,List<Integer>> buffer = new HashMap<>();
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
    

        for(int i = 0 ; i < groupSizes.length ; i++){

                if(!buffer.containsKey(groupSizes[i])) {
                    buffer.put(groupSizes[i], new ArrayList<>());
                }

                List<Integer> currentList = buffer.get(groupSizes[i]);
                currentList.add(i);

                if(currentList.size() == groupSizes[i]){
                    groups.add(currentList);
                    buffer.put(groupSizes[i],new ArrayList<>());
                }

        }


        return groups;
    }
}