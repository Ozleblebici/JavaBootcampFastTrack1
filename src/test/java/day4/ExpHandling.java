package day4;

import org.junit.Assert;

import java.util.NoSuchElementException;

public class ExpHandling {


    public static void main(String[] args) {

        //    throw new NoSuchElementException();


        try{
            System.out.println(1/0);
//            throw new RuntimeException();
            System.out.println("Happy path test");
            //test();
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("ArithmeticException throws!!!");
            System.out.println("Input quantity is 0!!");
        }catch (NullPointerException e){
            System.out.println("Exception !!!");
        } finally {
            System.out.println("Finally block!!!");
        }

        System.out.println("Out of try block");
    }

        public static void pauseRun(int seconds) throws InterruptedException {

        Thread.sleep(seconds * 1000);

    }





//    public static void clickElement(WebElement element){
//        try {
//            element.click();
//        } catch (NoSuchElementException e)   {
//
//            Assert.fail("Element not active on DOM!!");
//        } finally {
//
//        }
//    }
}
