class Solution {
    public int numSpecial(int[][] mat) {
        
        int result = 0;
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){

                if(mat[i][j] == 1){
                    int temp = 0;
                    for(int k = 0 ; k < r ; k++){
                        temp += mat[k][j];
                    }
                    for(int k = 0 ; k < c ; k++){
                        temp += mat[i][k];
                    }

                    if(temp == 2){
                        result++;
                    }

                }


            }
        }

    return result;

    }
}