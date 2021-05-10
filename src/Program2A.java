import java.util.Scanner;

public class Program2A {
    public static Scanner sc = new Scanner(System.in);
    public static String num;
    public static int total = 0;

    public static void main(String[] args) {
        accept();
        calculate();
        printResult();
    }

    public static void accept() {
        System.out.println("Enter a number: ");
        num = sc.next();
        sc.close();
    }

    public static void calculate() {
        for (int i = 0; i < num.length(); i++)
            total += Integer.parseInt(Character.toString(num.charAt(i)));
    }

    public static void printResult() {
        if (Integer.parseInt(num) % total == 0)
            System.out.println("This is a Harshad Number.");
        else
            System.out.println("This is not a Harshad Number.");
    }
}
