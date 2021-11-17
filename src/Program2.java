// importing all the modules

import java.util.Scanner;

public class Program2 {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);

    // make a main function to run the program
    public static void main(String[] args) {

        // take input for what the user wants to check
        System.out.println("Enter 1 to check for a Harshad Number, 2 to check for a Perfect Number: ");
        int n = sc.nextInt();

        switch (n) {

            // check for Harshad Number
            case 1:

                // take the number input
                System.out.println("Enter a number: ");
                String num1 = sc.next();
                sc.close();

                // calculate the harshad number
                int total = harshadCalculate(num1);

                // print results
                harshadPrintResult(num1, total);

                // check for Perfect Number
            case 2:

                // take the number input
                System.out.println("Enter a number: ");
                int num2 = sc.nextInt();
                sc.close();

                // calculate the perfect number
                int factorSum = perfectCalculate(num2);

                // print results
                perfectPrintResult(num2, factorSum);
        }
    }

    public static int harshadCalculate(String num) {

        // calculate and return the total
        int total = 0;
        for (int i = 0; i < num.length(); i++)
            total += Integer.parseInt(Character.toString(num.charAt(i)));

        return total;
    }

    public static void harshadPrintResult(String num, int total) {

        // print results of the calculation
        if (Integer.parseInt(num) % total == 0) System.out.println("This is a Harshad Number.");
        else System.out.println("This is not a Harshad Number.");
    }

    public static int perfectCalculate(int num) {

        // calculate and return the factor sum
        int factorSum = 0;
        for (int i = 1; i < num / 2; i++)
            if (num % i == 0) factorSum += i;

        return factorSum;
    }

    public static void perfectPrintResult(int num, int factorSum) {

        // print the final result
        if (num % factorSum == 0) System.out.println("This is a perfect number.");
        else System.out.println("This is not a perfect number.");
    }
}
