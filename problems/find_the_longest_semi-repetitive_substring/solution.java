class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
           if (s.length() == 1) {
            return 1;
        }

        int max = 0;
        int l = 0;
        int r = 1;
        int repFound = 0;
        int repIndex = 0;

        while (r < s.length()) {
            int n = Integer.parseInt(String.valueOf(s.charAt(r)));
            int p = Integer.parseInt(String.valueOf(s.charAt(r - 1)));

            if (p == n) {
                repFound++;
                if (repFound == 2) {
                    l = repIndex;
                    repIndex = r;
                    repFound = 1;
                }else {
                    repIndex = r;
                }


            }
            max = Math.max(max, r - l + 1);

        r++;

        }
        return max;

    }
}