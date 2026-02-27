
package twoSum.PracticePrograms;

public class ZeroesInend {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,2,3};
        for(int i =0 ;i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        for(int i =0 ;i<arr.length; i++){
            if(arr[i]==0){
                for(int j =i ;j<arr.length-1; j++){ arr[j]=arr[j+1]; }
                arr[arr.length-1] = 0;
            }
        }
        System.out.println("Zeros in last");
         for(int i =0 ;i<arr.length; i++){ System.out.print(arr[i]+ " ");}
    }
}
