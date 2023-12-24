class Solution {
    public int minOperations(String s) {

        Character prev = s.charAt(0);
        int step = 0;
        for(int i = 1; i < s.length(); i++){
            Character next = s.charAt(i);
            if(prev == next){
                step++;
                prev = prev == '0' ? '1' : '0';
            }else prev = next;
        }

        prev = s.charAt(0) == '0' ? '1' : '0';
        int stepT = 1;
        for(int i = 1; i < s.length(); i++){
            Character next = s.charAt(i);
            if(prev == next){
                stepT++;
                prev = prev == '0' ? '1' : '0';
            }else prev = next;
        }
        

        return Math.min(step,stepT);
        
    }
}
