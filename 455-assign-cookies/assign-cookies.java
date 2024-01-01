class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int slength = s.length;
        int glength = g.length;

        if(s.length ==0){
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0;
        int sidx = 0;

        for(int i = 0 ; i < glength; i++){
        
            for(int j = sidx ; j < slength; j++){
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


