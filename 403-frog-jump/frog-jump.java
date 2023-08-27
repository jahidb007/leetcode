class Solution {
    public boolean canCross(int[] stones) {

      int[][] dp = new int[stones.length][10000];
        for(int i = 0 ; i < dp.length ; i++){
            Arrays.fill(dp[i],-1);
        }

        if(stones[1] - stones[0] != 1){
            return false;
        }

        return canCrossRec(stones, 1, 1, dp);
         
    }

private  boolean canCrossRec(int[] stones, int i, int jump, int[][] dp) {
    

     //   System.out.println(i);
        boolean result = false;
        if (i == stones.length - 1) {
            return true;
        }

        if (dp[i][jump] != -1) {
            return dp[i][jump] == 0 ? false : true;
        }


        if (result == false) {
            int nextStone = 0;
            for (int k = i + 1; k < stones.length; k++) {
                if (stones[i] + jump == stones[k]) {
                    nextStone = k;
                    break;
                }

                if(stones[i] + jump < stones[k]){
                    break;
                }


            }
            if (nextStone != 0) {
                result = canCrossRec(stones, nextStone, jump, dp);
            }

        }


        if (result == false) {
            int nextStone = 0;
            for (int k = i + 1; k < stones.length; k++) {
                if (stones[i] + jump + 1 == stones[k]) {
                    nextStone = k;
                    break;
                }
                if(stones[i] + jump + 1 < stones[k]){
                    break;
                }


            }
            if (nextStone != 0) {
                result = canCrossRec(stones, nextStone, jump + 1, dp);
            }

        }


        if (result == false && jump != 1) {
            int nextStone = 0;
            for (int k = i + 1; k < stones.length; k++) {
                if (stones[i] + jump - 1 == stones[k]) {
                    nextStone = k;
                    break;
                }

                if(stones[i] + jump - 1 < stones[k]){
                    break;
                }


            }
            if (nextStone != 0) {
                result = canCrossRec(stones, nextStone, jump - 1, dp);
            }

        }

        dp[i][jump] = result == true ? 1 : 0;
      //  System.out.println(i + " "+ jump);
        return result;

    }


}