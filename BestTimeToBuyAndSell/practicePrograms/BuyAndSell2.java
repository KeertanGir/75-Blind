
package BestTimeToBuyAndSell.practicePrograms;

public class BuyAndSell2 {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,3};
        int profit =0 , buy = prices[0], sell = 0 ;
        for(int i =0; i<prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            sell = prices[i];
            if(sell > buy){
                profit += sell - buy;
                buy = prices[i];
                sell = 0;
            }   
        }
        System.out.println(profit);
      
        
    }
}
