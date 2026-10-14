class Solution {
    public String maxSumOfSquares(int num, int sum) {
         if(9 * num < sum){
            return "";
        }


        StringBuilder sb = new StringBuilder("");
        int nines = sum / 9;
        int rem = sum % 9;
        int ind = 0;
        for(int i = 0 ; i < nines; i++){
            ind++;
            sb.append("9");
        }

        if(rem > 0){
            sb.append(Integer.toString(rem));
            ind++;
        }

        while(ind < num){
            sb.append("0");
            ind++;
        }
       // System.out.println(System.currentTimeMillis());
        return sb.toString();
    }
    
}