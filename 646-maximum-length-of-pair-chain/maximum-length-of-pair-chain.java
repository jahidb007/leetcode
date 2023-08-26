class Solution {
    public int findLongestChain(int[][] pairs) {
        int[] dp = new int[pairs.length];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp, -1);
        }
        int max = 0;
        for (int i = 0; i < pairs.length; i++) {
            int temp = findLongestChainRec(pairs, i, dp);
            if (max < temp) {
                max = temp;
            }
        }

        return max;
    }


 private  int findLongestChainRec(int[][] pairs, int i, int[] dp) {

        if (pairs.length == 1) {
            return 1;
        }

        if (dp[i] != -1) {
            return dp[i];
        }
        int max = 1;

        for (int j = 0; j < pairs.length; j++) {

            if (j == i) {
                continue;
            }
            int temp = 0;
            if (pairs[i][1] < pairs[j][0]) {
                temp = 1 + findLongestChainRec(pairs, j, dp);

                if (max < temp) {
                    max = temp;
                }

            }

        }

        dp[i] = max;


        return max;

    }

}