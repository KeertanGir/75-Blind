
package twoSum.PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class occuriencies {
    public static void main(String[] args) {
        int [] arr = {1,1,2,1,2,4,3,3,2,4,1};
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.putIfAbsent(arr[i], 1);
            }
        }
        
        map.forEach((key, value) -> System.out.println(key +" --> "+ value));
        
        
    }
}
