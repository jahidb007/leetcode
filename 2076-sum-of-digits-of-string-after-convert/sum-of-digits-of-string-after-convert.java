class Solution {
    public int getLucky(String s, int k) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            t += s.charAt(i) - 'a' + 1;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if(sum != 0){
                t = String.valueOf(sum);
            }
            sum = 0;
            for (int j = 0; j < t.length(); j++) {
                sum += t.charAt(j) - 48;
            }
        }
        
        return sum;
    }
}