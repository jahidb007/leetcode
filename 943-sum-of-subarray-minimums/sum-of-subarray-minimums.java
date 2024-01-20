class Solution {
    private final int mod = 1000000007;
    public int sumSubarrayMins(int[] arr) {
        
        long sum  = 0;

        for(int i = 0 ; i < arr.length; i++){
            long l = 1;

            for(int j = i -1 ; j >= 0 ; j--){
                if(arr[i] <= arr[j]){
                    l++;
                }else break;
            }


            long r = 1;
            boolean sameFound = false;
            for(int j = i + 1 ; j < arr.length ; j++){
                
                if(arr[i] < arr[j]){
                    r++;
                }else if (arr[i] == arr[j]){
                    r++;
                    sameFound = true;
                }else break;
            }

           // System.out.println(arr[i]+ " : "+l+" "+r);

            sum = (sum + arr[i] * l * r) % mod ;
            
            if(sameFound) arr[i] = arr[i] - 1;

        }

        //sum = sum % mod;
        return (int) sum;
        
    }
}