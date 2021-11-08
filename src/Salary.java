import java.util.Scanner;

class Salary{
    public static String name, emp_num;
    public static int basic;
    public static Scanner scan = new Scanner(System.in);
    public static double gross;
    public static double net;

    Salary(){
        name = "";
        emp_num = "";
        basic = 0;
        gross = 0;
        net = 0;
    }

    void input(){
        System.out.println("Enter Employee Name: ");
        name = scan.nextLine();
        System.out.println("Enter Employee Number: ");
        emp_num = scan.next();
        System.out.println("Enter Employee Basic Salary: ");
        basic = scan.nextInt();
    }

    void compute() {
        double da = 0.3 * basic;
        double pf = 0.3 * basic;
        double hra = 0.15 * basic;
        gross = basic+da+hra;
        net = gross-pf;
    }

    void display() {
        System.out.println("Name: "+name);
        System.out.println("Employee Number: "+emp_num);
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
    }

    public static void main(String[] args) {
        Salary salary = new Salary();
        salary.input();
        salary.compute();
        salary.display();
    }
}
