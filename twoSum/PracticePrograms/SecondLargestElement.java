
package twoSum.PracticePrograms;

import java.util.Arrays;


public class SecondLargestElement {
    public static void main(String [] args){
        int [] arr = {12,22 ,33,10};
        int scndMax = 0;
        int max = arr[0];
        for(int i= 0; i<arr.length; i++){
            if(arr[i] > max){
                scndMax = max;
                max = arr[i];
            }
        }
        System.out.println(scndMax);
//        ----------- Way 2 ------------------
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
