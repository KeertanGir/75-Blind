
package twoSum.PracticePrograms;


import java.util.HashSet;

import java.util.Set;

public class useHashSet {
    public static void main(String [] args){
        int [] arr = {1,22,23,1};
        Set<Integer> st = new HashSet<>();
        for(int i =0 ; i<arr.length; i++){
            if(st.contains(arr[i])){
                System.out.println("Duplicate is :  " +arr[i]);
                return;
            }else{
                st.add(arr[i]);
            }
        }
        
       
       
        st.forEach(System.out::println);
        
        
        
        
        
    }
    
}
