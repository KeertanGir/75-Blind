
package BestTimeToBuyAndSell.practicePrograms;

import java.util.Scanner;

public class ZerosInEnd {
//    way 1  
    public static void zeroEnd(int [] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]== 0){
                for(int j = i; j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
                
                arr[arr.length -1] =0;
            }
        }
    }
    
//    way 2
    public static void zeroEnd2(int [] arr){
        int index = 0; // tracking Variable
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index ++;
            }
        }
        
        while(index<arr.length){
              arr[index] = 0;
              index ++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array : ");
        int size = sc.nextInt();
        int [] arr = new int[size]; 
        System.out.println("Enter Elements Of the Array One By One : ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        zeroEnd2(arr);
        
        
        for(int val : arr){
            System.out.print(val+ " ");
        }
    }
    
    
}
