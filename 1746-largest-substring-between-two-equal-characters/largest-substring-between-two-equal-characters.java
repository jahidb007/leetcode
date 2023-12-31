class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        int h = s.length();

        int[][] chr = new int[10000][1];

        for(int i = 0 ; i < h; i++){
            
            if(chr[s.charAt(i)][0] == 0){
                chr[s.charAt(i) ][0] = i+1;
            }else{
                res = Math.max(res, i - chr[s.charAt(i)][0]);
            }

           
        }

        return res;

    }
}