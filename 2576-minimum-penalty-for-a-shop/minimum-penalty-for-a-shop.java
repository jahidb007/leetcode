class Solution {
    public int bestClosingTime(String customers) {
    //     int[] a = new int[customers.length() + 1];
        int count = 0;
    //    for (int i = 0; i < customers.length(); i++) {
    //        if (customers.charAt(i) == 'Y') {
    //            count++;
    //        }
    //    }
    //    if(count == 0 ){
   //         return count;
     //   }


     //   a[0] = count;
        int minHour = 0;
        int minCount = count;

        for (int i = 0; i < customers.length(); i++) {
        

            if (customers.charAt(i) == 'Y') {
                count--;
            }else count++;



          //  a[i + 1] = count;
            if(count < minCount){
                minCount = count;
                minHour = i +1;
            }
        }

       return minHour;  
    }
}