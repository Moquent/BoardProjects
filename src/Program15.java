class BookFair {

    // declare all variables
    public static String BName;
    public static double price;
    public static double discountedPrice;

    // make a constructor to hold all the properties
    public BookFair() {
        BName = "";
        price = 0;
        discountedPrice = 0;
    }

    public static void calculate() {

        // calculate the discounted price
        if (price <= 1000) discountedPrice = (98.0 / 100.0) * price;
        else if (price <= 3000) discountedPrice = (90.0 / 100.0) * price;
        else if (price > 3000) discountedPrice = (85.0 / 100.0) * price;
    }

    public static void display() {

        // display the final bill price of the book
        System.out.println("Name of the book: " + BName);
        System.out.println("MRP of the book: " + price);
        System.out.println("Discounted price of the book: " + discountedPrice);
    }
}

public class Program15 {

    // make a main function to run the program
    public static void main(String[] args) {

        // instantiate the class
        BookFair book = new BookFair();
        book.BName = "Harry Potter";
        book.price = 499;

        // calculate and display the discounted price
        book.calculate();
        book.display();
    }
}
