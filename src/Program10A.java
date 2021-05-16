<<<<<<< HEAD
import java.util.Scanner;
import java.lang.Math;

public class Program10A {
    public static Scanner sc = new Scanner(System.in);
    public static int sum;
    public static int n;
    public static int length;

    public static void main(String[] args) {
        accept();
        calculateLength();
        calculateSum();
        printResult();
    }

    public static void accept() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();
        System.out.println();
    }

    public static void calculateLength() {
        int temp = n;
        while (temp != 0) {
            length = length + 1;
            temp = temp / 10;
        }
    }

    public static void calculateSum() {
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
        if (n == sum)
            System.out.println("This is a Disarium number.");
        else
            System.out.println("This is not a Disarium number.");
    }
}
=======
import java.util.Scanner;
import java.lang.Math;

public class Program10A {
    public static Scanner sc = new Scanner(System.in);
    public static int sum;
    public static int n;
    public static int length;

    public static void main(String[] args) {
        accept();
        calculateLength();
        calculateSum();
        printResult();
    }

    public static void accept() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();
        System.out.println();
    }

    public static void calculateLength() {
        int temp = n;
        while (temp != 0) {
            length = length + 1;
            temp = temp / 10;
        }
    }

    public static void calculateSum() {
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
        if (n == sum)
            System.out.println("This is a Disarium number.");
        else
            System.out.println("This is not a Disarium number.");
    }
}
>>>>>>> done with the project
