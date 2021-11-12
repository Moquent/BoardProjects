// importing all the modules

import java.util.Scanner;

public class Program2A {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static String num;
    public static int total;

    // make a main function to run the program
    public static void main(String[] args) {

        // run all the functions
        accept();
        calculate();
        printResult();
    }

    public static void accept() {

        // take the number input
        System.out.println("Enter a number: ");
        num = sc.next();
        sc.close();
    }

    public static void calculate() {

        // calculate the total
        total = 0;
        for (int i = 0; i < num.length(); i++)
            total += Integer.parseInt(Character.toString(num.charAt(i)));
    }

    public static void printResult() {

        // print results of the calculation
        if (Integer.parseInt(num) % total == 0)
            System.out.println("This is a Harshad Number.");
        else
            System.out.println("This is not a Harshad Number.");
    }
}
