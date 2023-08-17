class Solution {
    int[][] grid;
    int m;
    int n;
    public int[][] updateMatrix(int[][] mat) {
        grid = new int[mat.length][mat[0].length];
        m = mat.length;
        n = mat[0].length;
        Arrays.stream(grid).forEach(row -> Arrays.fill(row,-1));
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                updateGrid(mat,i,j);
            }
        }

        return grid;

    }

    private  int updateGrid(int[][] mat,int i,int j) {
        
        int val = Integer.MAX_VALUE;
        if (i < 0 || i == m || j < 0 || j == n) {
            return Integer.MAX_VALUE;
        }

        if (mat[i][j] == 0) {
            grid[i][j] = 0;
            return 0;
        }


        if (grid[i][j] != -1) {

            // check surronding!


            Stack<Integer> stack = new Stack<>();

            int l = Integer.MAX_VALUE, r = Integer.MAX_VALUE, u = Integer.MAX_VALUE, d = Integer.MAX_VALUE;
            //up
            if (i > 0) u = grid[i - 1][j] == -1 ? Integer.MAX_VALUE : grid[i - 1][j];
            //down
            if (i < m - 1) d = grid[i + 1][j] == -1 ? Integer.MAX_VALUE : grid[i + 1][j];
            //left
            if (j > 0) l = grid[i][j - 1] == -1 ? Integer.MAX_VALUE : grid[i][j - 1];
            //right
            if (j < n - 1) r = grid[i][j + 1] == -1 ? Integer.MAX_VALUE : grid[i][j + 1];

            //put values on queue

            stack.add(u);
            if (stack.peek() > d) {
                stack.add(d);
            }
            if (stack.peek() > l) {
                stack.add(l);
            }
            if (stack.peek() > r) {
                stack.add(r);
            }

            int k = stack.peek();

            if (k != Integer.MAX_VALUE && k < grid[i][j] - 1) {
                grid[i][j] = k + 1;
                return grid[i][j];
            } else return grid[i][j];


        } else grid[i][j] = Integer.MAX_VALUE;


        // System.out.println(i + " "+ j);

        // check left
        if (val != 0) {
            val = Math.min(updateGrid(mat, i, j - 1), val);
        }

        // check right
        if (val != 0) {
            val = Math.min(updateGrid(mat, i, j + 1), val);
        }
        // check up
        if (val != 0) {
            val = Math.min(updateGrid(mat, i - 1, j), val);
        }
        // check down
        if (val != 0) {
            val = Math.min(updateGrid(mat, i + 1, j), val);
        }
        if (val != Integer.MAX_VALUE) {
            val++;
        }
        grid[i][j] = val;
        return val;


    }


}