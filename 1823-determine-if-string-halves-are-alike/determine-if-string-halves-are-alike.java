class Solution {
    public boolean halvesAreAlike(String s) {
        int left = 0;
        int right = 0;

        for(char c : s.substring(0, s.length()/2).toCharArray()){
            if(c == 'a' || c == 'e' || c=='i' || c== 'o' || c== 'u' ||
               c == 'A' || c == 'E' || c=='I' || c== 'O' || c== 'U'){
                   left++;
               }
        }

        for(char c : s.substring(s.length()/2, s.length()).toCharArray()){
            if(c == 'a' || c == 'e' || c=='i' || c== 'o' || c== 'u' ||
               c == 'A' || c == 'E' || c=='I' || c== 'O' || c== 'U'){
                   right++;
               }
        }

        if(left == right) return true;

        return false;
    }
}