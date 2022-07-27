package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionStudies {


    public static void main(String[] args) {

        ArrayList<Integer> dbList = new ArrayList();
        dbList.add(4);
        dbList.add(3);
        dbList.add(2);
        dbList.add(1);

        System.out.println(dbList);


        ArrayList<Integer> expectedList = new ArrayList<>();

        expectedList.addAll(dbList);

        System.out.println("list2 = " + expectedList);

//        list2.clear();
//
//        System.out.println("list2 = " + list2);

//


        System.out.println("dbList.contains(4) = " + dbList.contains(5));

        dbList.add(5);

        System.out.println("dbList.containsAll(list2) = " + dbList.containsAll(expectedList));

        System.out.println("list2.containsAll(dbList) = " + expectedList.containsAll(dbList));

//        String str= "Test";
//
//        str=str.toLowerCase(); re assign again


//            while(!expectedList.isEmpty()){
//                System.out.println(expectedList.get(0) +" data checked , now delete it: !");
//                // do verification....
//                expectedList.remove(0);
//                expectedList.remove(new Integer(1));
//            }

        System.out.println("expectedList = " + expectedList);
        System.out.println("dbList = " + dbList);
            dbList.removeAll(expectedList);
        System.out.println("dbList = " + dbList);



        String [] strArray = {"A","B"};

        List<String> strList = Arrays.asList(strArray);

        System.out.println("strList = " + strList);

        Object[] objects = strList.toArray();
    }
}
