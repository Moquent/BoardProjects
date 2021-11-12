// importing all the modules

import java.util.Scanner;

public class Program11 {

    // declare all variables
    public static Scanner sc = new Scanner(System.in);
    public static int value;
    public static int[] arr = {1982, 1987, 1993, 1996, 2003, 2006, 2007, 2009, 2010};

    // make a main function to run the program
    public static void main(String[] args) {

        // run all functions
        accept();
        printResult();
    }

    public static void accept() {

        // take input of the year
        System.out.print("Enter the year of graduation: ");
        value = sc.nextInt();
        sc.close();
        System.out.println();
    }

    public static boolean binarySearch(int[] array, int value, int first, int last) {

        // check if array contains the year using binary search
        if (last >= 0) {
            int mid = first + (last - first) / 2;

            if (array[mid] == value)
                return true;
            else if (array[mid] > value)
                return binarySearch(array, value, first, mid - 1);
            else
                return binarySearch(array, value, mid + 1, last);
        }
        return false;
    }

    public static void printResult() {

        // print results
        if (binarySearch(arr, value, 0, arr.length - 1))
            System.out.println("Record exists.");
        else
            System.out.println("Record doesn't exist.");
    }
}
