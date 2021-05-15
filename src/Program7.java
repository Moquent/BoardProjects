import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
    public static Scanner sc = new Scanner(System.in);
    public static int[][] arr = new int[3][3];

    public static void main(String[] args) {
        accept();
        System.out.println(Arrays.deepToString(arr));
        System.out.println(calculate(arr));

    }

    public static void accept() {
        for (int i = 0; i < 3; i++) {
            String[] nums = sc.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
            }
        }
    }

    public static int calculate(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
