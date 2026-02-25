
package twoSum.PracticePrograms;

import java.lang.reflect.Array;

public class ContainTargets {
    public static void main(String [] args){
        int [] arr = {1,2,6,8,9};
        int Target = 6;
        for(int i = 0; i<arr.length; i++){
            
            if(Array.get(arr, i).equals(Target)){
                System.out.println(i);
                System.out.println(Array.get(arr, i).equals(Target));
            }
        }
        
        
    }
}
