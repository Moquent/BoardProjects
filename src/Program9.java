public class Program9 {
    public static void main(String[] args) {
        check("HELLO THERE", 'E');
    }

    public static void check(String str, char ch) {
        System.out.println();
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                n++;
            }
        }
        System.out.println("Number of " + ch + " present is " + n);
    }

    public static void check(String s1) {
        System.out.println();
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
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }
}
