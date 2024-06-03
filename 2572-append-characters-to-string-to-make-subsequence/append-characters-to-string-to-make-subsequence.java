class Solution {
    public int appendCharacters(String s, String t) {
        int si = 0;
        int ti = 0;
        int allFound = 1;

        for(int i = ti ; i < t.length(); i++){
            int found = 0;
            for(int j = si; j < s.length(); j++){
                if(t.charAt(i) == s.charAt(j)){
                    si = j + 1;
                    found = 1;
                    break;
                    
                }
            }
            
            if(found == 0){
                ti = i;
                allFound = 0;
                break;
            }
        }

        return allFound == 0 ? t.length() - ti : 0;
    }
}