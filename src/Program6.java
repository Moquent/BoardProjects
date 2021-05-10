import java.util.Scanner;

public class Program6 {
    public static int n = 10;
    public static String[] names = new String[10];
    public static double[] percentages = new double[10];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        takeInput();
        sortStudents();
        printToppers();
    }

    private static void takeInput() {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1));
            names[i] = sc.nextLine();
            System.out.println("Enter percentage of " + names[i] + (i + 1));
            percentages[i] = Double.parseDouble(sc.nextLine());
            sc.close();
        }
    }

    private static void swap(int pos1, int pos2) {
        String tempName = names[pos2];
        double tempPercentage = percentages[pos2];
        names[pos2] = names[pos1];
        percentages[pos2] = percentages[pos1];
        names[pos1] = tempName;
        percentages[pos1] = tempPercentage;
        sc.close();
    }

    private static void sortStudents() {
        for (int i = n - 1; i > 0; i--)
            for (int j = i - 1; j >= 0; j--)
                if (percentages[i] > percentages[j])
                    swap(i, j);
    }

    private static void printToppers() {
        for (int i = 0; i < 10; i++)
            System.out.println((i + 1) + ".\nName: " + names[i] + "\nPercentage: " + percentages[i]);
    }
}
