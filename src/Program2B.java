import java.util.Scanner;

public class Program2B {
    public static Scanner sc = new Scanner(System.in);
    public static int num;
    public static int factorSum = 0;

    public static void main(String[] args) {
        accept();
        calculate();
        printResult();
    }

    public static void accept() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        sc.close();
    }

    public static void calculate() {
        for (int i = 1; i < num / 2; i++)
            if (num % i == 0) factorSum += i;
    }

    public static void printResult() {
        if (num % factorSum == 0) System.out.println("This is a perfect number.");
        else System.out.println("This is not a perfect number.");
    }
}
