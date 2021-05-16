<<<<<<< HEAD
import java.util.Arrays;

public class Program13 {
    public static int[][] m = {{12, 23, 33, 22}, {20, 31, 44, 10}, {10, 25, 14, 8}, {41, 52, 24, 12}};
    public static int[][] n = {{8, 22, 31, 15}, {11, 16, 30, 26}, {10, 17, 25, 33}, {12, 24, 21, 32}};
    public static int[][] p = new int[4][4];

    public static void main(String[] args) {
        makeTable();
        System.out.println(Arrays.deepToString(p));
    }

    public static void makeTable() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                p[i][j] = m[i][j] + n[i][j];
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }
}
=======
import java.util.Arrays;

public class Program13 {
    public static int[][] m = {{12, 23, 33, 22}, {20, 31, 44, 10}, {10, 25, 14, 8}, {41, 52, 24, 12}};
    public static int[][] n = {{8, 22, 31, 15}, {11, 16, 30, 26}, {10, 17, 25, 33}, {12, 24, 21, 32}};
    public static int[][] p = new int[4][4];

    public static void main(String[] args) {
        makeTable();
        System.out.println(Arrays.deepToString(p));
    }

    public static void makeTable() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                p[i][j] = m[i][j] + n[i][j];
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }
}
>>>>>>> done with the project
