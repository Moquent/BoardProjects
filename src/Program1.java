// importing all the modules

import java.util.Scanner;

class ElectricBill {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static String n;
    public static int units;
    public static double bill;

    // make a constructor to hold the properties
    public ElectricBill() {
        n = "";
        units = 0;
        bill = 0;
    }

    // make a main function to run the program
    public static void main(String[] args) {

        // instantiate the class
        ElectricBill EBill = new ElectricBill();

        // run the member methods of the object
        EBill.accept();
        EBill.calculate();
        EBill.print();
    }

    public static void accept() {

        // take inputs of the details
        System.out.println("Enter the customers name: ");
        n = sc.nextLine();
        System.out.println("Enter the units consumed: ");
        units = sc.nextInt();
    }

    public static void calculate() {

        // calculate the total price
        if (units <= 100)
            bill = units * 2;
        else if (units <= 300)
            bill = 200 + (units - 100) * 3;
        else
            bill = (200 + 600 + (units - 300) * 5) + ((200 + 600 + (units - 300) * 5) / 100.0);
    }

    public static void print() {

        // print the final bill results
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
    }
}
