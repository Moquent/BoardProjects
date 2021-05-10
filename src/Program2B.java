import java.util.Scanner;

public class Program2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int factorSum = 0;
        for (int i = 1; i < num / 2; i++)
            if (num % i == 0) factorSum += i;

        if (num % factorSum == 0) System.out.println("This is a perfect number.");
        else System.out.println("This is not a perfect number.");
    }
}
