<<<<<<< HEAD
public class Program8 {
    public static void main(String[] args) {
        print4();
    }

    public static void print1() {
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print2() {
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print3() {
        for (int i = 0; i < 6; i++) {
            for (int j = 'A'; j < 'A' + (2 * 6) - 1; j++) {
                if (j >= ('A' + 6 - 1) + i)
                    System.out.print((char) (('A' + 6 - 1) - (j % ('A' + 6 - 1))));
                else if (j <= ('A' + 6 - 1) - i)
                    System.out.print((char) j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 'A'; j < 'A' + (2 * 6) - 1; j++) {
                if (j >= ('A' + 6 - 1) + i)
                    System.out.print((char) (('A' + 6 - 1) - (j % ('A' + 6 - 1))));
                else if (j <= ('A' + 6 - 1) - i)
                    System.out.print((char) j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print4() {
        char x = 'J';
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print((x) + " ");
                x--;
            }
            System.out.println();
        }
    }
}
=======
import java.util.Scanner;

public class Program8 {
    public static Scanner sc = new Scanner(System.in);
    public static int printNum = 0;

    public static void main(String[] args) {
        accept();
        executePrintPattern();
    }

    public static void accept() {
        System.out.print("Enter the print pattern number 1-4: ");
        printNum = sc.nextInt();
    }

    public static void executePrintPattern() {
        switch (printNum) {
            case 1:
                print1();
                break;
            case 2:
                print2();
                break;
            case 3:
                print3();
                break;
            case 4:
                print4();
                break;
        }
    }

    public static void print1() {
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print2() {
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print3() {
        for (int i = 0; i < 7; i++) {
            for (int j = 'A'; j < 'A' + (2 * 6) - 1; j++) {
                if (j >= ('A' + 6 - 1) + i)
                    System.out.print((char) (('A' + 6 - 1) - (j % ('A' + 6 - 1))));
                else if (j <= ('A' + 6 - 1) - i)
                    System.out.print((char) j);
                else if (i != 6)
                    System.out.print(" ");
            }
            if (i != 6)
                System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = 'A'; j < 'A' + (2 * 6) - 1; j++) {
                if (j >= ('A' + 6 - 1) + i)
                    System.out.print((char) (('A' + 6 - 1) - (j % ('A' + 6 - 1))));
                else if (j <= ('A' + 6 - 1) - i)
                    System.out.print((char) j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print4() {
        char x = 'J';
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print((x) + " ");
                x--;
            }
            System.out.println();
        }
    }
}
>>>>>>> done with the project
