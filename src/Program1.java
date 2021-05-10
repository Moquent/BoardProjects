import java.util.Scanner;

public class Program1 {
    public static Scanner sc = new Scanner(System.in);
    public static String n;
    public static int units;
    public static double totalCost;

    public static void main(String[] args) {
        accept();
        calculate();
        printResult();
    }

    private static void accept() {
        System.out.println("Enter the customers name: ");
        n = sc.nextLine();
        System.out.println("Enter the units consumed: ");
        units = sc.nextInt();
    }

    private static void calculate() {
        totalCost = 0;
        int temp = units;
        boolean above300 = units > 300;

        if (units > 100) {
            totalCost += 100 * 2;
            units -= 100;
        } else if (units > 0 && units < 100) {
            totalCost += units * 2;
            units -= units % 100;
        }
        if (units > 200) {
            totalCost += 200 * 3;
            units -= 200;
        } else if (units > 0 && units < 200) {
            totalCost += units * 3;
            units -= units % 200;
        }
        if (units > 0) totalCost += units * 5;
        if (above300) totalCost += 2.5 / 100 * totalCost;
        units = temp;
    }

    private static void printResult() {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + totalCost);
    }
}
