package day3;

import org.testng.annotations.Test;

public class ForLoop {


    public static void main(String[] args) {

//        for (int a = 0, b = 0; a + b < 10; System.out.println("Last action!"), a++, b++) {
//            System.out.println("Hi");
//        }

        //////////////////


        //itar
        for (int i = 0; i < 5; i++) {  // Outer loop !!

            for (int j = 0; j < 3; j++) { // inner loop !!
                System.out.println("i= " + i + " , j= " + j);
            }
        }


        //////////////

        String[] strArray = {"a", "b", "c"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        //iter  FOR EACH
        for (String s : strArray) {
            System.out.println(s);
        }


        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
//        Line   Star
//        1       1
//        2       2
//        3       3
//        4       4
//        5       5

        for (int i = 1; i <= 5; i++) {  // Outer loop -- prints - jump to next ROW!!!!!

            for (int j = 1; j <= i; j++) { // inner loop !! should prints starts !!!
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n/////////////////////////\n");
        /////////////////////////

//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

//        Line   Star
//        1       5
//        2       4
//        3       3
//        4       2
//        5       1

        for (int i = 5; i >= 0; i--) {  // Outer loop -- prints - jump to next ROW!!!!!

            for (int j = 1; j <= i; j++) { // inner loop !! should prints starts !!!
                System.out.print("* ");
            }
            System.out.println();
        }


        multiValues(null);

    }

    public static void multiValues(Integer n) {

        if (n == null) {
            System.out.println("Invalid input!!!");
        } else {


            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " X " + i + " = " + (n * i));
            }
        }
    }
}
