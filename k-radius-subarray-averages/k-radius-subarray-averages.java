class Solution {
    public int[] getAverages(int[] nums, int k) {
            if(k == 0){
                return nums;
            }


         int[] result = new int[nums.length];
        int average = 0;
        int rem = 0;
        int divider = 2 * k + 1;
        boolean firstTime = false;
        for (int i = 0; i < nums.length; i++) {
            if (i < k || i + k >= nums.length) {
                result[i] = -1;
            } else {
                if (!firstTime) {
                    for (int j = i - k; j <= i + k; j++) {
                        int val = nums[j] + rem;
                        average = average + (val / divider);
                        rem = val % divider;
                    }

                    result[i] = average;
                    firstTime = true;
                }else {

                    int prev = nums[i-k-1];
                    int next = nums[i+k];

                    rem = rem - prev + next ;

                    if(rem < 0){
                        average = average + ( rem / divider) + (rem % divider == 0 ? 0 : -1);
                        rem = rem % divider == 0 ? 0 : divider + rem % divider;

                    }else{
                        average = average + ( rem / divider);
                        rem = rem % divider;
                    }

                    result[i] = average;

                }
            }
        }
        return result;
    }
}