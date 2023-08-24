class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
          List<String> data = new ArrayList<>();
        String temp = "";
        for (String word : words) {
            if (temp.length() == 0) {
                temp = word;
            } else if (temp.length() + word.length() + 1 <= maxWidth) {
                temp = temp + " " + word;
            } else {
                data.add(temp);
                temp = word;
            }
        }
        data.add(temp);

        List<String> finalString = new ArrayList<>();

        for (int i = 0; i < data.size() -1; i++) {

            finalString.add(formatText(data.get(i),maxWidth));


        }
        String lastString = data.get(data.size()-1);
        if(lastString.length() < maxWidth){
            lastString = lastString + giveMeSpaces(maxWidth - lastString.length());
            finalString.add(lastString);
        }else finalString.add(lastString);


        return finalString;
    }

     private  String formatText(String s, int maxWidth) {

        if (!s.contains(" ")){
            s = s + giveMeSpaces(maxWidth - s.length());
            return s;
        }

        if(s.length() == maxWidth){
            return  s;
        }


        String[] strings = s.split(" ");
        int count = strings.length -1 ;


        int width = maxWidth - s.length() + strings.length - 1;
        int dev = width / count;
        int rem = width % count;
        s = "";

        for(int i = 0 ; i < strings.length-1 ; i++){

            s = s+ strings[i] + giveMeSpaces(dev);
            if(rem > 0 ){
                s = s + " ";
                rem--;
            }

        }
        s = s + strings[strings.length-1];

            return s;

    }

    private  String giveMeSpaces(int i) {
        String temp = "";
        for(int j = 0 ; j < i ; j++ ){
            temp = temp + " ";
        }
        return temp;
    }


}