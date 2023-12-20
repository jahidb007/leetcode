class Solution {
    public int buyChoco(int[] prices, int money) {
 

        if(prices.length == 0 || prices.length == 1 ){
            return money;
        }
        
        int fl = Integer.MAX_VALUE;
        int sl = Integer.MAX_VALUE ;

        for(int i = 0 ; i < prices.length; i++){
            if(fl >= prices[i]){
                sl = fl;
                fl = prices[i];
            }else if (sl >= prices[i]){
                sl = prices[i];
            }
        }

        if( fl + sl <= money){
            return money - fl - sl;
        }else return money;

        

    }
}

