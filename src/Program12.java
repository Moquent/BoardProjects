// importing all the modules

import java.util.Scanner;

public class Program12 {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static String str;

    // make a main function to run the program
    public static void main(String[] args) {

        // run all functions
        accept();
        printResult();
    }

    public static void accept() {

        // take input of word
        System.out.print("Enter a word: ");
        str = sc.next();
        sc.close();
        System.out.println();
    }

    public static int checkPos(String str) {

        // check if a vowel is present in the string "str"
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for (char vowel : vowels) {
                if (str.charAt(i) == vowel) {

                    // return index of letter if present
                    return i;
                }
            }
        }

        // return -1 if not present
        return -1;
    }

    public static void printResult() {

        // convert string to pig latin
        int pos = checkPos(str);
        if (pos > -1)
            str = str.substring(pos) + str.charAt(0) + str.substring(0, pos - 1) + "ay";

        // display word in pig latin
        System.out.println("The word in Pig Latin is: " + str);
    }
}
