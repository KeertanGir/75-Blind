
package twoSum.PracticePrograms;

public class ReverseArray {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6};
        int last = arr.length-1;
        for(int i =0 ;i< arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i = 0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[last-i];
            arr[last-i] = temp;
        }
        System.out.println("-----------------");
        for(int i =0 ;i< arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
