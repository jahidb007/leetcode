class Solution {
    public String addStrings(String num1, String num2) {
        String big = "";
        String small = "";
        if(num1.length()>num2.length()){
            big = num1;
            small = num2;
        }else{
            big = num2;
            small = num1;
        }
        int c = 0;
        String result = "";
        int travers = 0;
        for(int i=big.length()-1;i>-1;i--){
            int j = 0;
            int k = 0;
            try {
                 j = Integer.parseInt(String.valueOf(big.charAt(i)));
            }catch (Exception e){
            }
            try {
                 k = Integer.parseInt(String.valueOf(small.charAt(small.length()-1-travers)));
                travers++;
            }catch (Exception e){
            }
          

            int l = j+k+c;

            if(l>9){
                result = String.valueOf(l%10).concat(result);                c = 1;
            }else{
                result = String.valueOf(l).concat(result);  
                c = 0;
            }
        }
        if(c==1){
           result = String.valueOf(1).concat(result);    
        }
        return result;
    }
}