class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] data = new int[timePoints.size()];

        int i = 0;
        for(String t : timePoints){
            String hh = t.split(":")[0];
            String mm = t.split(":")[1];
            data[i] = Integer.valueOf(hh) * 60 + Integer.valueOf(mm);
            i++;
        }

        Arrays.sort(data);
        int min = 14444;
        for( i = 1 ; i < data.length ; i++){
            int diff = data[i] - data[i-1];
          

            if(diff == 0 ){
                return 0;
            }

            if(diff < min){
                min = diff;
            }

        }


       int diff = data[data.length - 1] - data[0];
        if(1439 - diff < diff){
                diff = 1440 - diff;
            }

            if(diff < min){
                min = diff;
            }

        return min;
    }
}