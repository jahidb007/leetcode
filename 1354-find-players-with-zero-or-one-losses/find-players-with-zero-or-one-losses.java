class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        Set<Integer> loosers = new HashSet<>();
        Set<Integer> bigLoosers = new HashSet<>();

        for(int i = 0 ; i < matches.length ; i++ ){
            if(!loosers.contains(matches[i][0]) && !bigLoosers.contains(matches[i][0])){
                winners.add(matches[i][0]);
            }

            if(!loosers.contains(matches[i][1]) && !bigLoosers.contains(matches[i][1])){
                loosers.add(matches[i][1]);
            }else{
                loosers.remove(matches[i][1]);
                bigLoosers.add(matches[i][1]);
            }

            if(winners.contains(matches[i][1])){
                winners.remove(matches[i][1]);
            }


        }

        List<List<Integer>> result = new ArrayList();
        result.add(new ArrayList());
        result.add(new ArrayList());

        result.get(0).addAll(winners);
        result.get(1).addAll(loosers);

        Collections.sort(result.get(0));
        Collections.sort(result.get(1));

        return result;
    }
}