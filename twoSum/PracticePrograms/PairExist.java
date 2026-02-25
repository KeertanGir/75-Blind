
package twoSum.PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class PairExist {
    public static void main(String [] args){
        
        int [] arr = {1, 4, 5, 18};
        int target = 9;
        boolean isAvailable = false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length; i++){
            int key = target - arr[i];
            if(map.containsKey(key)){
                isAvailable = true;
            }else{
                map.put(arr[i], i);
            }
        }
        
        System.out.println(isAvailable);
        
        
            
    }
}
