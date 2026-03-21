/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hp
 */
public class RemoveDuplicateFromShortedArray {
//    MySolution
    public static int removeDuplicate(int [] nums){
        Set<Integer> mySet = new HashSet<>();
//        Arrays.sort(nums);
        int idx = 0;
        for(int i = 0 ;i< nums.length; i++){
            if(!mySet.contains(nums[i])){
                mySet.add(nums[i]);
                nums[idx++] = nums[i]; 
            }else{
                nums[i] = -1;
            }
        }  
        return mySet.size();
    }
    
    public static int removeDupliOptimal(int [] nums){
        int idx = 0;
//        Arrays.sort(nums);
        for(int i =1; i< nums.length; i++){
            if(nums[i] != nums[idx]){
                nums[++idx] = nums[i];
            }else{
                nums[i] = Integer.MIN_VALUE;
            }
        }
        
        for(int n : nums){
            System.out.println(n);
        }
        
        return idx+1;
    } 
    
    
    
    public static void main(String [] args){
        int [] nums = {1,2,2,3,4,5,5,12};
//        int duplicateremoved2 = removeDuplicate(nums);
         int duplicateremoved = removeDupliOptimal(nums);
        
        System.out.println(duplicateremoved);
    }
    
}
