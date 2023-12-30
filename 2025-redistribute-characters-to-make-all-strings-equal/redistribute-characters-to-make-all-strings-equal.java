class Solution {
    public boolean makeEqual(String[] words) {
         if (words.length == 1) {
			return true;
		}
        int len = 0;
        int[] chr = new int[26];
        for(String word : words){

            for(Character c : word.toCharArray()){
                chr[c - 'a'] = chr[c - 'a'] + 1;
                len++;
            }
        }

        if(len % words.length !=0) return false;

        for(int i = 0 ; i < chr.length ; i++){
            if(chr[i] % words.length !=0 ){
                return false;
            }
        }

        return true;
    }
}