import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
    public static Scanner sc = new Scanner(System.in);
    public static int[][] arr = new int[3][3];

    public static void main(String[] args) {
        System.out.println("Enter 3 lines with 3 numbers on each line.");
        accept();

        System.out.println("2D Array Structure: " + Arrays.deepToString(arr));
        System.out.println("Total Sum: " + calculateTotal(arr));
        System.out.println("Diagonal Sum: " + calculateDiagonal(arr));

    }

    public static void accept() {
        for (int i = 0; i < 3; i++) {
            String[] nums = sc.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
            }
        }
    }

    public static int calculateTotal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int calculateDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
