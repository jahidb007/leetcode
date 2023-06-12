class Solution {
    public List<String> summaryRanges(int[] nums) {
          List<String> strings = new ArrayList<>();
        int consc = 0;
        int i = 0;
        while (i < nums.length) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != nums[j - 1] + 1) {
                    break;
                }
                consc++;
            }
            String s;
            if (consc == 0) {
                s = String.valueOf(nums[i]);
            } else {
                s = nums[i] + "->" + nums[i + consc];
            }
            strings.add(s);
            i = i + consc + 1;
            consc = 0;
        }

        return strings;
    }
}