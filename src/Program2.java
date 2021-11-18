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
                int total = 0;
                for (int i = 0; i < num1.length(); i++)
                    total += Integer.parseInt(Character.toString(num1.charAt(i)));

                // print results of the calculation
                if (Integer.parseInt(num1) % total == 0) System.out.println("This is a Harshad Number.");
                else System.out.println("This is not a Harshad Number.");

                // check for Perfect Number
            case 2:

                // take the number input
                System.out.println("Enter a number: ");
                int num2 = sc.nextInt();
                sc.close();

                // calculate the perfect number
                int factorSum = 0;
                for (int i = 1; i < num2 / 2; i++)
                    if (num2 % i == 0) factorSum += i;

                // print the final result
                if (num2 % factorSum == 0) System.out.println("This is a perfect number.");
                else System.out.println("This is not a perfect number.");
        }
    }
}
