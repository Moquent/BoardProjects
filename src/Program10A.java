import java.util.Scanner;
import java.lang.Math;

public class Program10A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(" ");

        int temp = n;
        int length = 0;
        while (temp != 0) {
            length = length + 1;
            temp = temp / 10;
        }

        int sum = 0;
        temp = n;
        while (temp != 0) {
            int num = temp % 10;
            sum += Math.pow(num, length);
            temp /= 10;
            length--;
        }

        if (n == sum)
            System.out.println("This is a Disarium number.");
        else
            System.out.println("This is not a Disarium number.");
    }
}