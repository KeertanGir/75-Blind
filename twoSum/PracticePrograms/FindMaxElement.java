
package twoSum.PracticePrograms;

public class FindMaxElement {
    public static void main(String [] args){
          int [] arr = {11,2,6,8,9,10};
          int max = arr[0];
          
//          First Simple Way  O(n log n)

//          Arrays.sort(arr);
//          System.out.println(arr[arr.length-1]);

//      2nd Approach O(n)
          for(int i = 0 ; i<arr.length;i++){
              if(max<arr[i]){
                  max = arr[i];
              }
          }
          System.out.println(max);
        
    }
    
}
