class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0 ; i < heights.length - 1; i++){
            for(int j = i+1 ; j < heights.length; j++){
                if(heights[i] < heights[j]){
                    int temp = heights[j];
                    String tname = names[j];
                    heights[j] = heights[i];
                    heights[i] = temp;

                    names[j] = names[i];
                    names[i] = tname;
                }
            }
        }

        return names;
    }
}