import java.util.Scanner;

public class Program5 {
    public static String[] words = new String[40];
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        accept();
        selectionSort();
        System.out.println("Sorted: ");
        printArray(words);
    }

    public static void accept() {
        System.out.println("Enter 40 words separated by a comma (Example: word1,word2,word3) : ");
        String wordsLine = sc.nextLine();
        sc.close();
        words = wordsLine.split(",");
    }


    public static void selectionSort() {
        for (int i = words.length - 1; i > 0; i--) {
            int maxnum = i;
            String max = words[i];

            for (int j = i - 1; j >= 0; j--) {
                if (words[j].compareTo(max) < 0) {
                    max = words[j];
                    maxnum = j;
                }
            }

            if (maxnum != i) {
                String temp = words[maxnum];
                words[maxnum] = words[i];
                words[i] = temp;
            }
        }
    }

    public static void printArray(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1)
                System.out.print(words[i] + ", ");
            else
                System.out.print(words[i]);
        }
    }
}
