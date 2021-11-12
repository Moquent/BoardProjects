// importing all the modules

import java.util.Scanner;
import java.lang.Math;

public class Program10A {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static int sum;
    public static int n;
    public static int length;

    // make a main function to run the program
    public static void main(String[] args) {

        // run all functions
        accept();
        calculateLength();
        calculateSum();
        printResult();
    }

    public static void accept() {

        // take a number input
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();
        System.out.println();
    }

    public static void calculateLength() {

        // calculate the length of the number "n"
        int temp = n;
        while (temp != 0) {
            length++;
            temp /= 10;
        }
    }

    public static void calculateSum() {

        // calculate the sum of all the digits in the number "n"
        sum = 0;
        int temp = n;

        while (temp != 0) {
            int num = temp % 10;
            sum += Math.pow(num, length);
            temp /= 10;
            length--;
        }
    }

    public static void printResult() {

        // print results
        if (n == sum)
            System.out.println("This is a Disarium number.");
        else
            System.out.println("This is not a Disarium number.");
    }
}
