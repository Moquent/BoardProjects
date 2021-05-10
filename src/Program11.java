import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();

        int[] arr = {1982, 1987, 1993, 1996, 2003, 2006, 2007, 2009, 2010};

        if (binarySearch(arr, value, 0, arr.length - 1))
            System.out.println("Record exists.");
        else
            System.out.println("Record doesn't exist.");
    }

    public static boolean binarySearch(int[] array, int value, int first, int last) {
        if (last >= 0) {
            int mid = first + (last - first) / 2;
            if (array[mid] == value)
                return true;
            else if (array[mid] > value)
                return binarySearch(array, value, first, mid - 1);
            else
                return binarySearch(array, value, mid + 1, last);
        }
        return false;
    }
}
