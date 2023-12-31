class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;

        int l = 0;
        int r = 1;
        int h = s.length();

        int[][] chr = new int[26][1];

        for(int i = 0 ; i < 26 ; i++){
          chr[i][0] = -1; 
        }
        

        for(int i = 0 ; i < s.length(); i++){
            
            if(chr[s.charAt(i) - 'a'][0] == -1){
                chr[s.charAt(i) - 'a'][0] = i;
            }else{
                res = Math.max(res, i - chr[s.charAt(i) - 'a'][0] - 1);
            }

           
        }

        return res;

    }
}