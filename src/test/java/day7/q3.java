package day7;

import java.util.Collections;
import java.util.List;

public class q3 {


    public static void main(String[] args) {

    }


    public static int   efficientJanitor (List<Float> weights){

        Collections.sort(weights);

        // left min   right max
        // 1.1

        int left = 0;  // index for min element  1  2 3
        int right = weights.size()-1; // 6 5 4 3  2 1
        int trip=0; // 1 2

        while (left <= right){

         if(weights.get(left) + weights.get(right) <= 3.0f ){
             left ++;
         }
            right --;
            trip++;
        }

        return trip;
    }
}
