class Solution {
    public boolean repeatedSubstringPattern(String s) {
                boolean result = false;
        for (int i = 0; i < s.length() / 2; i++) {
            result = checkIfValid(s, s.substring(0, i + 1));
            if (result == true) break;
        }

        return result;
    }

      private  boolean checkIfValid(String s, String substring) {
        boolean result = false;
        if (s.equals(substring)) {
            return true;
        }

        if (s.length() < substring.length()) {
            return false;
        }

        if (s.substring(0, substring.length()).equals(substring)) {

            if (s.length() >= substring.length() * 2) {
                result = checkIfValid(s.substring(substring.length(), s.length()), substring);
            } else result = false;


        } else {
            result = false;
        }

        return result;

    }


}