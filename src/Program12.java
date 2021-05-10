import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int pos = checkPos(str);

        if (pos > -1) {
            str = str.substring(pos) + str.charAt(0) + str.substring(0, pos - 1) + "ay";
        }
        System.out.println("The word in Pig Latin is: " + str);
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
}
