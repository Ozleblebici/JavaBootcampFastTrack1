package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {


    public static void main(String[] args) {


        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(1);
        intList.add(2);
        intList.add(30);
        intList.add(100);

        System.out.println("intList = " + intList);

        System.out.println("Collections.max(intList) = " + Collections.max(intList));



        System.out.println("After reverse intList = " + intList);


        Collections.sort(intList);

        System.out.println("After Sort intList = " + intList);


        List emptyList = Collections.EMPTY_LIST;

        Collections.replaceAll(intList,100,99);


        System.out.println("After replace intList = " + intList);


        System.out.println("emptyList = " + emptyList);

        System.out.println("emptyList.size() = " + emptyList.size());




    }
}
