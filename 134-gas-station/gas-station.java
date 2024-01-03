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

    public boolean circulate(int i , int pos, int t, int[] gas, int[] cost, int l){
        if(i == pos) return true;

        t = t + gas[pos] - cost[pos];

        if(t < 0){
            return false;
        }

        return circulate(i, (pos + 1) % l, t, gas, cost, l);

    }





}