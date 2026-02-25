
package twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String [] args){
        int [] nums = {1,2,3,11,22,12, 8, 5,4};
        int target = 12;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int current = nums[i];
            int key = target - current;
            if(map.containsKey(key)){
                System.out.println("Two Sum Founded!"); // > > 
                System.out.println("[ "+ map.get(key)  +" , "+ i +" ]"); // [0, 3] , [6,8]
            }else{
                System.out.println("No Any Sum Is found!");// ! ! ! ! ! ! !
//              [1,0], [2,1], [9,2], [22,4] , [12,5] , [8,6] , [5,7], [,]
                map.put( current , i );
                
            }
        }
        
    }
}
