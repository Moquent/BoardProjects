import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println(Sum(1.5));
    }

    public static int Sum(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static double Sum(double N) {
        double sum = 1;
        for (double i = 1.0; i < N; i += 0.2) {
            sum *= i;
        }
        sum *= N;

        return sum;
    }

    public static int Sum(int N) {
        int sum = 0;
        int temp = N;
        for (int i = 0; temp > 0; i++) {
            if ((temp % 10) % 2 != 0)
                sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }
}
