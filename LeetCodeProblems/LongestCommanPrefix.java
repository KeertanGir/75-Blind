/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCodeProblems;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class LongestCommanPrefix {
    
    public static String LongestCommonPrefixLeet(String [] strgs){
//        String output = "";
        StringBuilder output = new StringBuilder();
        if(strgs.length == 0){
            return "";
        }
        Arrays.sort(strgs);
        
        for(int i = 0;i<strgs[0].length(); i++){
            char first = strgs[0].charAt(i);
            char last = strgs[strgs.length - 1].charAt(i);
            if(first == last){
//               output += first; 
                output.append(first);
            }else{
                return output.toString();
            }
        }   
        
        return output.toString();
    
    }
    
//    By leetcode    
//    class Solution {
//
//    public String longestCommonPrefix(String[] strs) {
//    if (strs == null || strs.length == 0) return "";
//
//    for (int i = 0; i < strs[0].length(); i++) {
//        char c = strs[0].charAt(i);
//
//        for (int j = 1; j < strs.length; j++) {
//            if (i >= strs[j].length() || strs[j].charAt(i) != c) {
//                return strs[0].substring(0, i);
//            }
//        }
//    }
//    return strs[0];
//    }
//}
    
     static public void main(String [] args){
         
        String [] strg = {"rad", "radhe", "radhika"};
        String outp = LongestCommonPrefixLeet( strg );
         System.out.println(outp);
    }
    
}
