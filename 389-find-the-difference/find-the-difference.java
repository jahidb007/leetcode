class Solution {
    public char findTheDifference(String s, String t) {

        if(s.equals("")){
            return t.charAt(0);
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        int sn = 0;
        int tn = 0;
        for(Character c : tc){
           tn += c;
        }

        for(Character c : sc){
                sn += c;
            }

         return (char) (tn - sn);

    }
}