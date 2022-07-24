package day2;


import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

      //  checkLetter();

        
    }


    public static void checkLetter() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter INPUT: ");
        String input = scanner.next().toLowerCase();

        if (input.length() > 1) {
            System.out.println("ERROR, please provide 1 char!!");
            return;
        }

        boolean letter = input.charAt(0) >= 'a' && input.charAt(0) <= 'z';
        boolean vowel = input.equals("a") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("e");

        if (!letter) {
            System.out.println("ERROR, Not a LETTER !!!");
        } else if (vowel) {
            System.out.println("Input is a vowel");
        } else {
            System.out.println("Input is a consonant");
        }

    }
}
