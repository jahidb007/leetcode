class Solution {
    public int minOperations(String s) {
        char c = s.charAt(0);
        int step1 = count(s, c);
        int step2  = count(s,c == '0' ? '1' : '0') + 1;
        return Math.min(step1,step2);
    }
    public int count(String s, char prev){
        int step = 0;
        for(int i = 1; i < s.length(); i++){
            char next = s.charAt(i);
            if(prev == next){
                step++;
                prev = prev == '0' ? '1' : '0';
            }else prev = next;
        }
        return step;
    }
}
