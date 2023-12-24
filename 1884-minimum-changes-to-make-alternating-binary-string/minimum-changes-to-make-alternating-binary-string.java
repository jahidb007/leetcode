class Solution {
    public int minOperations(String s) {

        if(s.length() == 1){
            return 0;
        }
        
        Character prev = s.charAt(0);
        int step = 0;
        for(int i = 1; i < s.length(); i++){
            Character next = s.charAt(i);
            if(prev == next){
                System.out.println(i + " "+prev );
                step++;
                prev = prev == '0' ? '1' : '0';
                System.out.println(i + " "+prev );
            }else prev = next;
        }

        prev = s.charAt(0) == '0' ? '1' : '0';
        int stepT = 1;
        for(int i = 1; i < s.length(); i++){
            Character next = s.charAt(i);
            if(prev == next){
                System.out.println(i + " "+prev );
                stepT++;
                prev = prev == '0' ? '1' : '0';
                System.out.println(i + " "+prev );
            }else prev = next;
        }
        

        return Math.min(step,stepT);
        
    }
}
