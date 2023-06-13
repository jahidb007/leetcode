class Solution {
    public int equalPairs(int[][] grid) {
           int n = grid.length;

        int matched = 0;

        for(int i = 0;i <grid.length;i++){
            int[] temp = new int[grid.length];
            for(int j = 0 ; j<grid.length;j++){
                temp[j] = grid[i][j];
            }

            for(int k = 0 ; k <grid.length ; k++){
                int found = 0;
                for(int j = 0 ; j <grid.length ; j++){
                    if( temp[j] != grid[j][k] ){
                        break;
                    }else found++;
                }
                if(found == grid.length){
                    matched++;
                }
            }

        }
      return matched;
    }
}