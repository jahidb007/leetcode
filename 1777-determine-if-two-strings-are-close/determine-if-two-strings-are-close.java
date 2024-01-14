class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] a = new int[26];
        int[] b = new int[26];

          if (word1.equals(word2))  return true; 

        if(word1.length() != word2.length()){
            return false;
        }

        for(char c : word1.toCharArray()){
            a[c - 'a']++;
        }

        for(char c : word2.toCharArray()){
            if(a[ c - 'a'] == 0) return false;
            b[c - 'a']++;
        }

        for(int i = 0 ; i < 26; i++){


            if(a[i] != b[i] && (a[i] == 0 || b[i] == 0) ){
                return false;
            }

            if(a[i] == b[i]){
                a[i] = 0;
                b[i] = 0;
            }else{
                boolean found = false;
                for(int j = i+1 ; j < 26 ; j++){
                    if(a[j] == b[i]){
                        a[j] = a[i];
                        a[i] = 0;
                        b[i] = 0;
                        found = true;
                        break;
                    }
                }
                if(found == false) return false;
            }
        }

        return true;
    }
}
