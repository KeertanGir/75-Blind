
package pkg75hard.BestTimeForBuyAndSell.Practice;


public class MaxSubArray {
    
    public static int maxSubArr(int [] arr){
       // Stores the result (maximum sum found so far)
       int res = arr[0];
         // Maximum sum of subarray ending at current position
       int maxEnding = arr[0];
//       O(n)
        for(int i = 0;i<arr.length; i++){
            
            // Either extend the previous subarray or start 
            // new from current element
//             5                 5   +  1   6    ,   1
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            
            // Update result if the new subarray sum is larger
            
//            6            5    6
            res = Math.max(res , maxEnding);
        }
        
//               6
        return res;
    }
    
    public static void main(String [] args){
    
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        int maxsub = maxSubArr(arr);
        System.out.println(maxsub);
        
        
        
    }
    
}
