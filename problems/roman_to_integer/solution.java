class Solution {
    public int romanToInt(String s) {
       int i = s.length() - 1;
        int num = 0;
        int prev = 0;
        int sum = 0;

        while (i >= 0) {

            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            
            if (num < prev) {
                sum = sum - num;
            } else sum = sum + num;
             prev = num;
            i--;
        }

        return sum;
    }
}