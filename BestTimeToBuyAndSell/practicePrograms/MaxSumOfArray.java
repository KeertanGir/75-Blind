
package BestTimeToBuyAndSell.practicePrograms;

public class MaxSumOfArray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0, largest = 0;
        for(int i = 0 ; i< arr.length; i++){
            sum = 0;
            for(int j = i; j<arr.length;j++){
               sum = sum + arr[j];
               if(sum >= largest){
                   largest = sum;
                   
               }  
            }
        }
        System.out.println(largest);
    }
}
