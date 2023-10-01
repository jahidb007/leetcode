class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for(String word : words){

            String temp = "";

            for(int i = word.length() -1 ; i >=0  ; i--){
                temp += word.charAt(i);
            }

            result += temp + " ";

        }

        return result.substring(0,result.length()-1);
        
            }
}