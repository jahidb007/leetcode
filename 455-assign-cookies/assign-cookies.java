class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        if(s.length ==0){
            return 0;
        }
        
        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0;
        int sidx = 0;

        for(int i = 0 ; i < g.length; i++){

            for(int j = sidx ; j < s.length; j++){
                if(g[i] <= s[j]){
                    cnt++;
                    sidx = j+1;
                    break;
                }
            }
        }
        return cnt;
    }
}


