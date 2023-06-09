class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxSub = 0;
        int currentSub = 0;
        String currentString = "";
        HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (characters.contains(s.charAt(i))) {


                if (currentString.charAt(currentString.length() - 1) == s.charAt(i)) {
                    characters.removeAll(characters);
                    characters.add(s.charAt(i));
                    currentString = String.valueOf(s.charAt(i));
                    currentSub = 1;
                    characters.add(s.charAt(i));
                    maxSub = Math.max(maxSub, currentSub);
                } else if (currentString.charAt(0) == s.charAt(i)) {
                    currentString = currentString.substring(1, currentString.length());
                    currentString = currentString + s.charAt(i);
                    currentSub = currentString.length();
                    characters.add(s.charAt(i));
                    maxSub = Math.max(maxSub, currentSub);
                } else {

                    for (int l = 0; l < currentString.length(); l++) {
                        if (currentString.charAt(l) == s.charAt(i)) {
                            currentString = currentString.substring(l + 1, currentString.length());
                            break;
                        }
                    }

                    currentString = currentString + s.charAt(i);
                    currentSub = currentString.length();
                    characters.removeAll(characters);
                    for (int k = 0; k < currentSub; k++) {
                        characters.add(currentString.charAt(k));
                    }


                    maxSub = Math.max(maxSub, currentSub);
                }
            } else {
                characters.add(s.charAt(i));
                currentString = currentString + s.charAt(i);
                currentSub++;
                maxSub = Math.max(maxSub, currentSub);

            }
        }
        return maxSub;
    }
}