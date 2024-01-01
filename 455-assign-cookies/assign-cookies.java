class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0;
        int sidx = s.length - 1;

        for(int i = g.length - 1 ; i >= 0; i--){
          if(sidx < 0){
              break;
          }
            if(g[i] <= s[sidx]){
                cnt++;
                sidx--;
            }
           
        }
        return cnt;
    }
}