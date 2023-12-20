class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        if(prices.length == 0 || prices.length == 1 || prices[0] + prices[1] > money){
            return money;
        }else return money - prices[0] - prices[1];

        

    }
}

