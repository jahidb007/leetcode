class Solution {
    public int minChanges(String s) {
        char[] ch = s.toCharArray();
        int l = s.length();
        int result = 0;
        for (int i = 0; i < l / 2; i++) {
            int temp = ch[i * 2] + ch[i * 2 + 1];
            if (temp != 96 && temp != 98) {
                result++;
            }

        }

        return result;
    }
}