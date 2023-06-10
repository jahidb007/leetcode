class Solution {
    public boolean isFascinating(int n) {
         int j = n*2 * 1000;
        int k = n*3;

        if(j>999000){
            return false;
        }

        if(k>999){
            return false;
        }


         n = n*1000000 + j + k;

        Set<Integer> number = new HashSet<>();
        int i;
        while (n > 0){

            i = n%10;
            if(number.contains(i) || i == 0){
                return false;
            }else {
                number.add(i);
            }

            n = n /10;

        }



        return true;

    }
}