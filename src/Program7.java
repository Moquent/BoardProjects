import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        for (int i = 0; i < 4; i++) {
            String[] nums = sc.nextLine().split(" ");
            for (int j = 0; j < nums.length; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
