class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> chars = new HashSet<>();
        for(Character c : allowed.toCharArray()){
            chars.add(c);
        }

        int res = 0;

        for(String word : words){
            boolean found = true;
            for(Character c : word.toCharArray()){
                if(!chars.contains(c)){
                    found = false;
                    break;
                }
            }
                if(found == true){
                    res++;
                }
        }

        return res;
    }
}