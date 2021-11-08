import java.util.Scanner;

public class Program12 {
    public static Scanner sc = new Scanner(System.in);
    public static String str;

    public static void main(String[] args) {
        accept();
        printResult();
    }

    public static void accept() {
        System.out.print("Enter a word: ");
        str = sc.next();
        sc.close();
        System.out.println();
    }

    public static int checkPos(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for (char vowel : vowels) {
                if (str.charAt(i) == vowel) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printResult() {
        int pos = checkPos(str);
        if (pos > -1)
            str = str.substring(pos) + str.charAt(0) + str.substring(0, pos - 1) + "ay";

        System.out.println("The word in Pig Latin is: " + str);
    }
}
