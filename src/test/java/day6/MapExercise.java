package day6;

import java.util.*;

public class MapExercise {


    public static void main(String[] args) {

        String[] str = {};

//        System.out.println(wordMultiple(str));


//        System.out.println(keyCounter(str));


        System.out.println(findMostRepeatedStr(str));


    }


//    Ex-1
//Given an array of strings, return a Map<String, Boolean> where each different string is a key and
// its value is true if that string appears 2 or more times in the array.
//
//    Sample Inputs  Outputs
//    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//    wordMultiple(["c", "c", "c", "c"]) → {"c": true}


    public static Map<String, Boolean> wordMultiple(String[] inputArray) {

        List<String> listInput = Arrays.asList(inputArray);

        Collections.sort(listInput);


        if (inputArray == null) {
            System.err.println("INVALID INPUT!!!");
            return null;
        }

        Map<String, Boolean> returnMap = new HashMap<>();

        for (String str : listInput) {

            if (returnMap.containsKey(str)) {
                returnMap.put(str, true); // if str exist, it means that I have str more than 1
            } else {
                returnMap.put(str, false); // first time adding
            }
        }

        return returnMap;

        //RECORD!!!!

    }


    // EX-2

//    We have an input array of strings with lots of duplication:
//    Input sample: ["a", "a", "b", "f", "b", "a", "z", ....]
//
//    1- which strings appear in the array and how many times each one appears ?
//    2- What is the most repeated one?


    public static Map<String, Integer> keyCounter(String[] input) {
// Loop to check all array elements
// for each iter. we have to save keys counts separately --> create Map!!  haspMap!!

        if (input == null) {
            return null;
        }

        Map<String, Integer> returnMap = new HashMap<>();

        for (String str : input) {
            if (returnMap.containsKey(str)){
                returnMap.put(str, (returnMap.get(str) + 1) );
            } else{
                returnMap.put(str,1); // first time add element, assign count to 1
            }
        }

        return returnMap;
    }


    public static List<String> findMostRepeatedStr(String[]input){
        if (input == null) {
            System.err.println("INVALID INPUT!!");
            return null;
        } else if( input.length==0){
            return Collections.emptyList();
        }

        Map<String, Integer> returnMap = new HashMap<>();

        for (String str : input) {
            if (returnMap.containsKey(str)){
                returnMap.put(str, (returnMap.get(str) + 1) );
            } else{
                returnMap.put(str,1); // first time add element, assign count to 1
            }
        }

        List<String> mostRepeatedList = new ArrayList<>(); // to return possible keys which has max value

        int maxValue = Collections.max(returnMap.values());

        System.out.println("maxValue = " + maxValue);


        for (String key : returnMap.keySet()) { // it will return all keys as Collection!!
           if  (returnMap.get(key) == maxValue) {
               mostRepeatedList.add(key);
           }
        }

        return mostRepeatedList;

    }


}
