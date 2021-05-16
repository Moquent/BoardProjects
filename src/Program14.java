import java.util.Scanner;

public class Program14 {
    public static Scanner sc = new Scanner(System.in);
    public static String str = sc.next();

    public static void main(String[] args) {
        accept();
        calculateAndPrint();
    }

    public static void accept() {
        System.out.print("Enter a word: ");
        str = sc.next();
        sc.close();
        System.out.println();
    }

    public static void calculateAndPrint() {
        if (str.charAt(0) != str.charAt(str.length() - 1))
            System.out.println("This is not a special word.");
        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    System.out.println("This is a special word, but not a palindrome.");
                    break;
                }
            }
            System.out.println("This is a palindrome.");
        }
    }
}
