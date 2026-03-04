
package BestTimeToBuyAndSell.practicePrograms;

public class MinimumProfit {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int minProfit =arr[0];
        for(int i =0; i<arr.length; i++){
            for(int j= i; j<arr.length; j++){
                int min = arr[j] - arr[i];
                if(minProfit>min){
                    minProfit = min;
                }
            }
        
            
    }
        System.out.println(minProfit);
    }
}
