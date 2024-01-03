class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int m = 0;
        
        for(int i = 0 ; i < bank.length; i++){
            
            int laser = calcLaser(bank[i]);


            if(laser != 0){
                count +=  m * laser;
                m = laser;
            }
        }


        return count;


    }

     private int calcLaser(String s) {
        int count = 0;
        for(char c : s.toCharArray()) 
            count += c - '0';

        return count;
    } 
}