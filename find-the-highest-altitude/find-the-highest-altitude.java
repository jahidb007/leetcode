class Solution {
    public int largestAltitude(int[] gain) {
        int currentLevel = 0;
        int maxLevel = 0;
        for(int i = 0 ; i < gain.length ; i++){
            currentLevel = currentLevel + gain[i];
            if(currentLevel > maxLevel){
                maxLevel = currentLevel;
            }
        }

        return maxLevel;
    }
}