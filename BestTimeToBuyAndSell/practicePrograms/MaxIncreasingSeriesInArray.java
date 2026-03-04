package BestTimeToBuyAndSell.practicePrograms;

public class MaxIncreasingSeriesInArray {
    public static void main(String [] args){
        int [] arr = {1,2,5,2,3,8,9,10};
        int max = 1 , temp = 0, increasingArrCount = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                max++;   
            }else{
            max = 1;
            }
            if(increasingArrCount < max){
                    increasingArrCount = max;
            }
        }
        
        System.out.println(increasingArrCount);
    }
}
