class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int prevVal = s.charAt(0);

        for(Character c : s.toCharArray()){
            sum += Math.abs(prevVal - c );
       //     System.out.println(sum);
            prevVal = c;
        }

        return sum;
    }
}