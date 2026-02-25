package twoSum.PracticePrograms;

public class AllElementLessthanTarget {
    public static void main(String[] args) {
        int [] arr = {1,4,2,6,2,8,7,12,55,33,22};
        int target = 12;
        for(int i =0; i<arr.length;i++){
            if(arr[i] <= target){
                System.out.print(arr[i]);
            }
        }
    }
}
