class Solution {
    public int numDecodings(String s) {
    int[] dp = new int[s.length()];
    return decode(s, dp, 0);
    }
    

    public  int decode(String s, int[] dp, int i){
            

        if (s.length() <= i) {
            return 1;
        }
        
        if (dp[i] != 0) {
            return dp[i];
        }

        int result = 0;
        char f = s.charAt(i);

        if (f - '0' != 0) {
            result = decode(s, dp, i + 1);
        } else return 0;


        if (i + 1 < s.length()) {
            int fn = Integer.valueOf(s.substring(i, i + 2));

            if (fn > 0 && fn < 27) {
                result = result + decode(s, dp, i + 2);
            }

        }

        dp[i] = result;
        
        return result;

    }
}