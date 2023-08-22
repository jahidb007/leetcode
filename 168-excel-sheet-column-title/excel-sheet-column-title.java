class Solution {
    public String convertToTitle(int columnNumber) {
        
        String s = "";
        int j = convertIt(columnNumber, 1);

        for (int i = j; i > 0; i--) {

            int temp = columnNumber / (int) Math.pow(26, i - 1);

            if (columnNumber % (int) Math.pow(26, i - 1) == 0 && i != 1) {
                temp--;
            }


            Character c = (char) (temp + 64);
            s = s.concat(String.valueOf(c));

            columnNumber = columnNumber - temp * (int) Math.pow(26, i - 1);
        }

        return s;
    }

    private  int convertIt(int i, int j) {

        if (i <= Math.pow(26, j)) {
            return j;
        }

        return convertIt((int) (i - Math.pow(26, j)), j + 1);

    }
}