class Solution {
    public void rotate(int[] nums, int k) {
        int[] dp = new int[nums.length];

        if(nums.length == 1 || k == 0){
            return;
        }
for(int i = 0 ; i < nums.length; i++){
    if(dp[i] ==0) rotateRecur(nums,i, k, i,dp);  
    else break;
}


        

    }

    public void rotateRecur(int[] nums,int ini,int k,int m,int[] dp){
        int pos = ini + k;
        if(pos > nums.length - 1 ){
            pos = pos % nums.length;
        }

        if(pos == m){
           return ;
        }

        rotateRecur(nums, pos, k,m,dp);
        int temp = nums[ini];
        nums[ini] = nums[pos];
        nums[pos] = temp;
        dp[ini] = -1;
        dp[pos] = -1;
    }
}

// 4 3 2 1  7 6 5
// 5 6 7 1 2 3 4

// 1 2 3 4 5 6 7
