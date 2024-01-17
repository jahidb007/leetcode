class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] val = new int[2001];

        for(int i : arr){
            val[i + 1000]++;
        }

        Arrays.sort(val);

        int j = 2001 - 1;
        int prev = -1;
        int next = 0;
        while(val[j] !=0){
            next = val[j];
            if(next == prev) return false;
            prev = next;
            j--;
        }

        return true;
        
    }
}