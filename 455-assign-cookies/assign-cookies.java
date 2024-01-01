class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        // 
        int cnt = 0;

        for(int i = 0 ; i < g.length ; i++){
            
            int ckis =  Integer.MAX_VALUE;
            int idx = -1;

            for(int j = 0 ; j < s.length; j++){

                if(g[i] == s[j]){
                    idx = j;
                    break;
                }

                if(g[i] < s[j]){
                    
                    if(ckis > s[j]){
                       ckis = s[j];
                       idx = j; 
                    }
                }
            }
                if(idx != -1){
                    s[idx] = -1;
                    cnt++;
                }
        }

        return cnt;
        
    }
}

