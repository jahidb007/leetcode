class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        int divider = 1;
        for( int i = 0 ; i <= n ; i ++){
              if(i == 0){
                  a[i] = 0;
                  continue;
              }

            if( i % divider == (divider - 1)){
                a[i] =  1 + a[i % divider];;
                divider = divider * 2;
                continue;
            }

            a[i] = 1 + a[i % divider];
            

        }

        return a;
    }
}