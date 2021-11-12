public class Program9 {

    // make a main function to run the program
    public static void main(String[] args) {

        // run the function to check
        check("HELLO THERE", 'E');
    }

    // type 1 (overloading)
    public static void check(String str, char ch) {

        // check if a character is present in the string "str"
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                n++;
            }
        }

        // print result
        System.out.println("Number of " + ch + " present is " + n);
    }

    // type 2 (overloading)
    public static void check(String s1) {

        // check if a vowel is present in the string "s1"
        s1 = s1.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] letters = new char[5];
        int k = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (char vowel : vowels) {
                if (s1.charAt(i) == vowel) {
                    boolean isInArr = false;

                    for (char letter : letters) {
                        if (letter == vowel) {
                            isInArr = true;
                            break;
                        }
                    }

                    if (!isInArr) {
                        letters[k] = vowel;
                        k++;
                    }
                }
            }
        }

        // print all vowels present in the string "s1"
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }
}
