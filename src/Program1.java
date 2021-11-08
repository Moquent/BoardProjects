import java.util.Scanner;

class ElectricBill {
    public static Scanner sc = new Scanner(System.in);
    public static String n;
    public static int units;
    public static double bill;

    public ElectricBill() {
        n = "";
        units = 0;
        bill = 0;
    }

    public static void main(String[] args) {
        ElectricBill EBill = new ElectricBill();

        EBill.accept();
        EBill.calculate();
        EBill.print();
    }

    public static void accept() {
        System.out.println("Enter the customers name: ");
        n = sc.nextLine();
        System.out.println("Enter the units consumed: ");
        units = sc.nextInt();
    }

    public static void calculate() {
        if (units <= 100)
            bill = units * 2;
        else if (units <= 300)
            bill = 200 + (units - 100) * 3;
        else
            bill = (200 + 600 + (units - 300) * 5) + ((200 + 600 + (units - 300) * 5) / 100.0);
    }

    public static void print() {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
    }
}
