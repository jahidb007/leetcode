class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = gas.length;
        int[] gc = new int[l];
        int t = 0;
        for(int i = 0 ; i < l; i++){
            gc[i] = gas[i] - cost[i];
            t += gc[i];     
        }

        if(t < 0) return -1;

        int result = 0;
        int temp = 0;
        for(int i= 0 ; i < l ; i++){
            temp += gc[i];
            if(temp < 0 ){
                result = i+1;
                temp = 0;
            }
        }

        return result;
        
    }

}
//-----------------------------
//[1,2,3,4,5]
//[3,4,5,1,2]

//[-2,-2,-2,6,1,-10,3,4,2,3] >=0
//-----------------------------