class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            String s = Integer.toString(x);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}