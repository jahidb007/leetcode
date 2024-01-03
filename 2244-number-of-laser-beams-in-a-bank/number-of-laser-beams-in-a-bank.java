class Solution {
    public int numberOfBeams(String[] bank) {

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
        }

        int laser = 0;

        for(int i = 0; i < bl - 1 ; i++){
           for(int j = i+1; j < bl ; j++){
               if( data[j] != 0 ){
                   laser = laser + data[i] * data[j];
                   break;
               }
           }
        }

        return laser;


    }
}