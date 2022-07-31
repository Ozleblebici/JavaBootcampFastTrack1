package day7;

import java.util.Arrays;
import java.util.Collections;

public class q4 {






   public static int maxArea (int[]height){


       if(height.length == 2){
          return Math.min(height[0],height[1]);
       }

       int left = 0;
       int right = height.length -1;
       int maxArea=0;

       while (left <= right){
           int width = right - left;
           maxArea = Math.max(maxArea, (Math.min(height[left], height[right]) * width) ) ;

           if(height[right] >= height[left]){
               left++;
           } else {
               right--;
           }
       }

       return maxArea;

   }
}
