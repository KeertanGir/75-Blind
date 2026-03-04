
package BestTimeToBuyAndSell;

public class MaxProfit {
    public static void main(String [] args){
        int [] arr = {7,1,5,3,6,4};
        
//        Brute Force Approach
        int maxProfit = 0;
        for(int i = 0; i< arr.length; i++){ // O(n)
            for(int j=i; j< arr.length; j++){ // O(n) ==> O(n)+O(n) = O(n2)
               int profit = arr[j]-arr[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        System.out.println(maxProfit);
        
//        Optimal Sol  O(n)
        int [] arr2 = {7,1,5,3,6,4};
        int buy = arr[0], sell, mxProfit = 0;
        for(int i =0; i< arr.length ; i++){
            if(buy > arr[i]){
                buy = arr[i];
            }
            sell = arr[i];
            int profit = sell - buy;
            if(mxProfit < profit ){
                mxProfit = profit;
            }      
        }
        
        
        System.out.println(mxProfit);
        
        int [] arr3 = {7,1,5,3,6,4};
        int buy1 = arr3[0], sell1, mxProfit1 = 0;
        for(int i = 0; i< arr3.length; i++){
            if(buy1 > arr3[i]){
                buy = arr3[i];
            }
            
              mxProfit = Math.max(mxProfit, arr3[i]-buy);
        }
        
        
        
        
    }
}
