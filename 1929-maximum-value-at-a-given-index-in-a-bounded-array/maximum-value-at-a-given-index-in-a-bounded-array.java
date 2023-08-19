class Solution {
    public int maxValue(int n, int index, int maxSum) {
      if(maxSum == n){
            return  1;
        }


        int currentSum = n+1;
        int temp = 2;
        int j = 0;
        int l = index;
        int r = index;
        while ( currentSum < maxSum && !(l == 0 && r == n-1) ){
            temp++;
            if(l > 0) l--;
           if(r < n-1) r++;


           int diff = r - l +1;
           currentSum = currentSum + diff;
        }

       temp = temp + (maxSum - currentSum) / n;
    currentSum = currentSum + ((maxSum - currentSum) / n)*n;

     return     currentSum == maxSum ? temp : currentSum > maxSum ? temp-1 : temp;
    }
}