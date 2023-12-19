class Solution {
    public int[][] imageSmoother(int[][] img) {

        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];


        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                int r = getAverage(i, j, img);
                result[i][j] = r;
            }
        }

        return result;
        
    }

    public int getAverage(int i, int j, int[][] img){
        int m = img.length;
        int n = img[0].length;

        int cur = img[i][j];
        int count = 1;

        //top
        if( i != 0){
            cur += img[i-1][j];
            count++;
        }

        //bottom
        if( i < m - 1){
            cur += img[i+1][j];
            count++;
        }

        //left
        if( j != 0 ){
            cur += img[i][j-1];
            count++;
        }

        //right
        if( j < n-1){
            cur += img[i][j+1];
            count++;
        }

        //left top
        if( i != 0 && j != 0 ){
             cur += img[i-1][j-1];
            count++;
        }

        //right top
        if( i != 0 && j < n-1){
            cur += img[i-1][j+1];
            count++;
        }

        //left bottom
        if( j != 0 && i < m - 1){
            cur += img[i+1][j-1];
            count++;
        }

        //right bottom
        if( i < m - 1 && j < n-1){
            cur += img[i+1][j+1];
            count++;
        }

        return cur / count;
    }
}