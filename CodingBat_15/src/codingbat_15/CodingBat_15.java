
package codingbat_15;

import java.util.Arrays;
import java.util.Random;

public class CodingBat_15 {

public static int []nums(){
    Random rn = new Random();
    int []nums = new int[rn.nextInt(20)+1];
    
    for(int i=0;i<nums.length;i++){
        nums[i] = rn.nextInt(10)+1;
        
    }
     System.out.println(Arrays.toString(nums));
    return nums;
} 

public static int maxSpan(int []nums){
    int span = 1;
    
    if(nums.length==0){
        return 0;
    }
    
    for(int sol=0;sol<nums.length;sol++){
        for(int sag=nums.length-1;sag>=0;sag--){
            if(nums[sol]==nums[sag]){
                span = Math.max(span, sag-sol+1);
            }
        }
    }
        System.out.println(span);
    return span;
}
    
    public static void main(String[] args) {
        maxSpan(nums());
    }
    
}
