class Solution {
    public int minOperations(String s) {

        if(s.length() == 1){
            return 0;
        }
        
        int step0 = 0;
        Character init = '0';

        for(int i = 0 ; i < s.length() ; i++){
                if(init != s.charAt(i)){
                    step0++;
                }
                init = init == '0' ? '1' : '0';
        }

        int step1 = 0;
        init = '1';
        for(int i = 0 ; i < s.length() ; i++){
                if(init != s.charAt(i)){
                    step1++;
                }
                init = init == '0' ? '1' : '0';
        }



        return Math.min(step1,step0);
        
    }
}