package day7;

import java.util.*;

public class q2 {


    public static void main(String[] args) {


        // A - what if I have only 1 or 1 type data
        // B
        // A A A
        // B B B
        // A A B B C C D D E E - what if I have duplicated data with same quantity!!

        // {} empty array!!!
        // big data which has same str
        // A A A A A A A A A A A A A .......... A
        // A B C D E  -what if all of them unique
        // abc ab ac ad bd bc



        String []str = {"A","B","C","C", "A"};

        System.out.println(solution(str));


    }


    // return max repeated string quantity
    public static int solution(String []input){

        Set<String> strSet = new HashSet<>();
        //strSet.addAll(Arrays.asList(input));
        Collections.addAll(strSet,input);


        if(input.length == 1 || strSet.size() == input.length){
            return 1;
        }else if( strSet.size() == 1 ){
            return input.length;
        }

        Map<String,Integer> strMap = new HashMap<>();

        for (String str : input) {
            if(strMap.containsKey(str)){
                strMap.put(str,strMap.get(str)+1);
            } else {
                strMap.put(str,1);
            }
        }

        return Collections.max(strMap.values());
    }




}
