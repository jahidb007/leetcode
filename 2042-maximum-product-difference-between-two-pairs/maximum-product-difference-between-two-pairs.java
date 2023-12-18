class Solution {
    public int maxProductDifference(int[] nums) {
        int maxA = -1;
        int maxB = -1;
        int minA = 10000;
        int minB = 10000;

        for(int i = 0 ; i < nums.length ; i++){
            if(maxA <= nums[i]){
                maxB = maxA;
                maxA = nums[i];
            }else if(maxB <= nums[i]){
                maxB = nums[i];
            }

            if(minA >= nums[i]){
                System.out.println("current " + minA +" "+minB);
                minB = minA;
                minA = nums[i];
                System.out.println("updated " + minA +" "+minB);
            }else if(minB >= nums[i]){
                System.out.println("alternate current " + minA +" "+minB);
                minB = nums[i];
                System.out.println("alternate updated " + minA +" "+minB);
            }
            System.out.println();
        }
         System.out.println();
        System.out.println(maxA +" "+maxB +" "+minA +" "+minB);

        return (maxA * maxB) - (minA * minB);
    }
}