class Solution {
    public int minSteps(String s, String t) {

        int[] a = new int[26];
        int[] b = new int[26];

        for(char c : s.toCharArray()){
         a[c-'a']++;   
        }

        for(char c : t.toCharArray()){
         b[c-'a']++;  
        }

        int res = 0;

        for(int i = 0 ; i < 26 ; i++){
            if(a[i] > b[i]){
                res += a[i] - b[i];
            }
        }

        return res;

    }
}

