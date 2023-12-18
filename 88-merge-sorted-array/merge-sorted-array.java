class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int t = 0;
      int p = 0; 
       for(int i = 0 ; i < n ; i++){
           for(int j = p ; j < m + n ; j++){

               if(nums2[i] < nums1[j] || j >= m + t ){
                   for(int l = m + n -1 ; l > j ; l--){
                       nums1[l] = nums1[l-1];
                   }

                   nums1[j] = nums2[i];
                   t++;
                   p = j;
                   break;
               }


           }
       }


    }
}