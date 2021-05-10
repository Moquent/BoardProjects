public class Program8 {
    public static void main(String[] args) {
        print4();
    }

    public static void print1() {
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void print2() {
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
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
            System.out.println("");
        }
    }
}
