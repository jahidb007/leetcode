class Solution {
    public int romanToInt(String s) {
         int i = 0;
        String val;
        int sum = 0;
        while (i<s.length()){
            val = String.valueOf(s.charAt(i));

            if(i<s.length()-1){
                val = val + String.valueOf(s.charAt(i+1));
            }

            if(val.equals("IV")){
                sum = sum + 4;
                i = i+2;
            }else if(val.equals("IX")){
                sum = sum + 9;
                i = i+2;
            }else if(val.equals("XL")){
                sum = sum + 40;
                i = i+2;
            }else if(val.equals("XC")){
                sum = sum + 90;
                i = i+2;
            }else if(val.equals("CD")){
                sum = sum + 400;
                i = i+2;
            }else if(val.equals("CM")){
                sum = sum + 900;
                i = i+2;
            }else if(val.charAt(0) == 'I'){
                sum = sum + 1;
                i++;
            }else if(val.charAt(0) == 'V'){
                sum = sum + 5;
                i++;
            }else if(val.charAt(0) == 'X'){
                sum = sum + 10;
                i++;
            }else if(val.charAt(0) == 'L'){
                sum = sum + 50;
                i++;
            }else if(val.charAt(0) == 'C'){
                sum = sum + 100;
                i++;
            }else if(val.charAt(0) == 'D'){
                sum = sum + 500;
                i++;
            }else if(val.charAt(0) == 'M'){
                sum = sum + 1000;
                i++;
            }

        }
return sum;
    }
}