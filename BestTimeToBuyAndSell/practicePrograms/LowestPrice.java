
package BestTimeToBuyAndSell.practicePrograms;


public class LowestPrice {
    public static void main(String[] args) {
        int [] arr ={7,1,5,3,6,4};
        
        int lowestPriceIdx = 0, min = arr[0];
        
        for(int i =0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                lowestPriceIdx = i;
            }
        }
        
        System.out.println(lowestPriceIdx);
        
        
    }
    
}
