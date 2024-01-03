class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int m = 0;
        int n = 0;
        int bl = bank.length;
        for(int i = 0 ; i < bl; i++){
            
            int laser = 0;
            for(Character c : bank[i].toCharArray()){
                laser += c - '0';
            }


            if(laser != 0){
                count +=  m * laser;
                m = laser;
            }
        }


        return count;


    }
}