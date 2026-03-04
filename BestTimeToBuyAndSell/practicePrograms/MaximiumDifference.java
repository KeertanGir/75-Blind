
package BestTimeToBuyAndSell.practicePrograms;

public class MaximiumDifference {
    public static void main(String [] args){
        int [] arr = {2,3,10,6,4,8,1};
        int maxDiff = 0;
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int mx = arr[j] - arr[i];
                if(maxDiff< mx){
                    maxDiff = mx;
                }
            }
        }
        
        System.out.println(maxDiff);
        
    }
    
}
