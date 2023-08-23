class Solution {
    public String reorganizeString(String s) {
       Character l = '0';
        Character r = '0';
        Character n = '0';
        List<Character> red = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (temp.length() == 0) {
                n = '0';
            } else {
                n = temp.charAt(temp.length() - 1);
            }


            if (n != c) {
                temp += c;

            } else {
                red.add(c);
            }

        }
        int count = 0;

        boolean haveReorg = true;
        int initialCount = 0;

        while (haveReorg) {

            for (int i = 0; i < red.size(); i++) {
                if(red.get(i) == '-') continue;
                l = '0';
                r = '0';

                for (int j = 0; j <= temp.length(); j++) {
                    if (j == 0) l = '0';
                    else l = temp.charAt(j - 1);

                    if (j == temp.length()) r = '0';
                    else r = temp.charAt(j);

                    if (red.get(i) != l && red.get(i) != r) {

                        temp = temp.substring(0, j) + red.get(i) + temp.substring(j);
                        count++;
                        red.set(i,'-');
                        break;
                    }

                }

            }

           if(initialCount != count){
               initialCount = count;
           }else  haveReorg = false;


        }



        if (count == red.size()) {
            return temp;
        } else return "";

    
    
    }
}