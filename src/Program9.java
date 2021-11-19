import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program9 {

    // make a main function to run the program
    public static void main(String[] args) {

        // type 1
        check("HELLO THERE", "E");

        // type 2
        check("HELLO THERE");
    }

    // type 1 (overloading)
    public static void check(String str, char ch) {

        // check if a character is present in the string "str"
        int n = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                n++;

        // print result
        System.out.println("Number of " + ch + " present is " + n);
    }

    // type 2 (overloading)
    public static void check(String s1) {

        // print all the vowels in the string "si"
        s1 = s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
                System.out.println(s1.charAt(i));
        }
    }
}
