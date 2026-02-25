
package twoSum.PracticePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FisrtRepeatingElement {
    public static void main(String[] args) {
        int [] arr = {12,11,22,33,12};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.putIfAbsent(arr[i], 1);
            }else{
                System.out.println(arr[i]);
                map.put(arr[i], map.get(arr[i])+1);
                return;
            }
        }
        
        
        Set<Integer> st = new HashSet<>();
        for(int i= 0; i<arr.length ;i++){
            if(st.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                st.add(arr[i]);
            }
        }
        
    }
}
