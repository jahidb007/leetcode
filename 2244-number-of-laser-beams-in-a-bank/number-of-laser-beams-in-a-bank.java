class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int m = 0;
        int n = 0;
        int bl = bank.length;
        int[] data = new int[bl];
        for(int i = 0 ; i < bl; i++){
            int laser = 0;
            for(Character c : bank[i].toCharArray()){
                if(c == '1'){
                    laser++;
                }
            }
            data[i] = laser;
            if(laser != 0){
                n = laser;
                count = count + m * n;
                m = n;
            }
        }
        return count;


    }
}