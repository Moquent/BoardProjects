// importing all the modules

import java.util.Scanner;

public class Program10B {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static int n;

    // make a main function to run the program
    public static void main(String[] args) {

        // run all functions
        accept();
        printResult();
    }

    public static void accept() {

        // take number input
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();
        System.out.println();
    }

    public static boolean isHappy(int n) {

        // check if number "n" is a happy number
        while (n != 1) {
            int sum = 0;
            int temp = n;

            while (temp != 0) {
                int num = temp % 10;
                sum += num * num;
                temp /= 10;
            }

            if (sum == 4) return false;
            n = sum;
        }

        return true;
    }

    public static void printResult() {

        // print results
        if (isHappy(n))
            System.out.println("This is a happy number.");
        else
            System.out.println("This is not a happy number.");
    }
}
