package day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Set {


    public static void main(String[] args) {

        List<Integer> strList = new ArrayList<>();
        strList.add(10);
        strList.add(20);
        strList.add(2);
        strList.add(3000);
        strList.add(3000);

        strList.add(2);

        System.out.println(strList);


        ArrayList<String> ssList = new ArrayList<>();
        ssList.add("A");
        ssList.add("D");
        ssList.add("C");
        ssList.add("F");
        ssList.add("D");
        ssList.add("C");
        ssList.add("C");
        ssList.add("C");
        ssList.add("V");
        ssList.add("$");



        LinkedHashSet<Integer> strLinkSet = new LinkedHashSet<>();

        strLinkSet.addAll(strList);

        System.out.println("strLinkSet = " + strLinkSet);



        LinkedHashSet<String> ssLinkSet = new LinkedHashSet<>();

        ssLinkSet.addAll(ssList);

        System.out.println("ssLinkSet = " + ssLinkSet);


        HashSet<Integer> strHashSet = new HashSet<>();

        strHashSet.addAll(strList);

        System.out.println("strHashSet = " + strHashSet);


        HashSet<String> ssHashSet = new HashSet<>();

        ssHashSet.addAll(ssList);

        System.out.println("ssHashSet = " + ssHashSet);

    }
}
