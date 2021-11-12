// importing all the modules

import java.util.Scanner;

public class Program2B {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static int num;
    public static int factorSum = 0;

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
        num = sc.nextInt();
        sc.close();
    }

    public static void calculate() {

        // calculate the factor sum
        for (int i = 1; i < num / 2; i++)
            if (num % i == 0) factorSum += i;
    }

    public static void printResult() {

        // print the final result
        if (num % factorSum == 0) System.out.println("This is a perfect number.");
        else System.out.println("This is not a perfect number.");
    }
}
