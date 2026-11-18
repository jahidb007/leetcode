class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int left = 0;
        for(int i = 0 ; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                left++;
            } else if(moves.charAt(i) == 'U'){
                up++;
            } else if(moves.charAt(i) == 'R'){
                left--;
            } else if(moves.charAt(i) == 'D'){
                up--;
            }
        }

        if(left == 0 && up == 0){
            return true;
        } else return false;
    }
}