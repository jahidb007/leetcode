class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rl = grid.length;
        int cl = grid[0].length;

        int[] rowOnes = new int[rl];
        int[] colOnes = new int[cl];

        int[][] result = new int[rl][cl];

        for(int i = 0 ; i < rl ; i++){
            for(int j = 0; j < cl ; j++){
                if(grid[i][j] == 1){
                    rowOnes[i] += 1;
                    colOnes[j] += 1;
                }
            }
        }

            for(int i = 0 ; i < rl ; i++){
                for(int j = 0; j < cl ; j++){
                    result[i][j] = (2 * rowOnes[i]) + (2 *  colOnes[j]) - rl  - cl ;
                }
            }

        return result;

    }
}