class Solution {
    public void reverseString(char[] s) {
       int i = 0;
       int j = s.length - 1;

    while( i < j){
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
        i++;
        j--;
    }


    }

    private void reverse(int n,char[]  s){
        if(n == s.length){
            return;
        }

        reverse(n + 1, s);




    }
}