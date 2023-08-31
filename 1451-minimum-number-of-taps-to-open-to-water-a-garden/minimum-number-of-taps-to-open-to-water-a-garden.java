class Solution {
    public int minTaps(int n, int[] ranges) {
       int i = 0;
        int count = 0;
        while (i < n) {
            // check which got the i
            int mostRight = 0;
            int currentRight = 0;
            for (int j = 0; j < ranges.length; j++) {

                if (j == i) {
                    if (ranges[i] > 0) {
                        currentRight = j + ranges[j];
                    }

                } else {

                    if (i  >= j - ranges[j] && i < j + ranges[j]) {
                        currentRight = j + ranges[j];
                    }

                }

                if (mostRight < currentRight) {
                    mostRight = currentRight;

                }
            }
            if (mostRight == 0) {
                return -1;
            }

            i = mostRight;
            count++;
        }

        return count;
    }
}