// importing all the modules

import java.util.Scanner;

public class Program14 {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static String str = sc.next();

    // make a main function to run the program
    public static void main(String[] args) {

        // run all functions
        accept();
        calculateAndPrint();
    }

    public static void accept() {

        // take word input
        System.out.print("Enter a word: ");
        str = sc.next();
        sc.close();
        System.out.println();
    }

    public static void calculateAndPrint() {

        // check if the word is special or not and print the result
        if (str.charAt(0) != str.charAt(str.length() - 1))
            System.out.println("This is not a special word.");

        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    System.out.println("This is a special word, but not a palindrome.");
                    break;
                }
            }

            System.out.println("This is a palindrome.");
        }
    }
}
