class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] data = new int[points.length];
        for(int i = 0; i < data.length; i++){
            data[i] = points[i][0];
        }
        Arrays.sort(data);

        int max = -1;

        for(int i = 0 ; i < data.length - 1; i++){
            int diff = data[i] - data[i+1];
            if(diff < 0 ) diff = diff * -1;
            if(diff > max){
                max = diff;
            }
        }

        return max;
    }
}