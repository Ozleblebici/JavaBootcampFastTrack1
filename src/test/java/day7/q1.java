package day7;

import java.util.*;

public class q1 {


    public static void main(String[] args) {

    }


    //Write a Java program to shuffle elements in a array list.

    public static List<String> shuffle( List<String> input){

//        List<String> returnList = new ArrayList<>();
//
//        // A B C D A B
//        Random random = new Random();   //3 - A   , 3- B
//        int index=0;
//        for (String s : input) {
//
//            while(!returnList.get(index).isBlank()){
//                index= random.nextInt(6);
//            }
//            // I will have a non-assigned index
//            returnList.add(index,s);
//
//        }

        Collections.shuffle(input);
        return  input;

    }


}
