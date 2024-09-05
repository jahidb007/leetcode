class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;

        int totalValue = (m  + n) * mean;
        int sum = 0;
        for(int val : rolls){
            sum += val;
        } 


        int diff = totalValue - sum;

        if(diff < 1){
            return new int[0];
        }


       
        int base = diff / n;
        int rem = diff % n;


        if( base > 6 || (base == 6 && rem != 0) || diff < n ){
            return new int[0];
        }

        int[] result = new int[n];
        

        Arrays.fill(result, base);

        

        if(rem != 0){
            for(int i = 0 ; i < rem; i++){
                result[i] = result[i] + 1;
            }
        }

        return result;


    }
}