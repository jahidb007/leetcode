class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int m = 0;
        
        for(int i = 0 ; i < bank.length; i++){
            
            int laser = 0;
            for(char c : bank[i].toCharArray()) 
            laser += c - '0';

            if(laser != 0){
                count +=  m * laser;
                m = laser;
            }
        }


        return count;


    }

}