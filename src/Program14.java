import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
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
