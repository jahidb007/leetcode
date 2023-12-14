class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rl = grid.length;
        int cl = grid[0].length;

        int[][] rowOnes = new int[rl][2];
        int[][] colOnes = new int[cl][2];

        int[][] result = new int[rl][cl];

        for(int i = 0 ; i < rl ; i++){
            for(int j = 0; j < cl ; j++){
                if(grid[i][j] == 1){
                    rowOnes[i][1] += 1;
                    colOnes[j][1] += 1;
                }else {
                    rowOnes[i][0] += 1;
                    colOnes[j][0] += 1;
                }
            }
        }

            for(int i = 0 ; i < rl ; i++){
                for(int j = 0; j < cl ; j++){
                    result[i][j] =  rowOnes[i][1] +  colOnes[j][1] - rowOnes[i][0] - colOnes[j][0] ;
                }
            }

        return result;

    }
}