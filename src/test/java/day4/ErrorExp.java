package day4;

import java.util.NoSuchElementException;

public class ErrorExp {


    public static void main(String[] args) throws InterruptedException{

        pause(2);
        System.out.println("TEST");

        int expetedValue= 100;
        int actualValue= 0;

      //  System.out.println(expetedValue/actualValue);

        int a = 2;

//        a;

        String [] str = {"A","B"} ;

//        System.out.println(str.length);

        test(str);

        System.out.println("str[2] = " + str[2]);

    }


    public static void test(String[]str){
        System.out.println("str.length = " + str[1]);
    }

    public static void pause(int seconds) throws InterruptedException {

        Thread.sleep(seconds*1000);
    }

}

