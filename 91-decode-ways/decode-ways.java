class Solution {
    public int numDecodings(String s) {
    int[] dp = new int[s.length()];
    Arrays.fill(dp, -1);
    return decode(s, dp, 0);
    }
    

    public  int decode(String s, int[] dp, int i){
        int len = s.length();  

        if (len == i) {
            return 1;
        }
        
        if (dp[i] != -1) {
            return dp[i];
        }

        int result = 0;
        char f = s.charAt(i);

        if (f  != '0' ) {
            result = decode(s, dp, i + 1);
        } else return 0;


        if (i + 1 < len) {
            char fs = s.charAt(i + 1);

            if (f == '1' || ( f == '2' && fs <= '6')) {
                result = result + decode(s, dp, i + 2);
            }

        }

        dp[i] = result;
        
        return result;

    }
}