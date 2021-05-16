<<<<<<< HEAD
class BookFair {
    public static String BName;
    public static double price;
    public static double discountedPrice;

    public BookFair() {
        BName = "";
        price = 0;
        discountedPrice = 0;
    }

    public static void calculate() {
        if (price <= 1000) discountedPrice = (98.0 / 100.0) * price;
        else if (price <= 3000) discountedPrice = (90.0 / 100.0) * price;
        else if (price > 3000) discountedPrice = (85.0 / 100.0) * price;
    }

    public static void display() {
        System.out.println("Name of the book: " + BName);
        System.out.println("MRP of the book: " + price);
        System.out.println("Discounted price of the book: " + discountedPrice);
    }
}

public class Program15 {
    public static void main(String[] args) {
        BookFair book = new BookFair();
        book.BName = "Harry Potter";
        book.price = 499;

        book.calculate();
        book.display();
    }
}
=======
class BookFair {
    public static String BName;
    public static double price;
    public static double discountedPrice;

    public BookFair() {
        BName = "";
        price = 0;
        discountedPrice = 0;
    }

    public static void calculate() {
        if (price <= 1000) discountedPrice = (98.0 / 100.0) * price;
        else if (price <= 3000) discountedPrice = (90.0 / 100.0) * price;
        else if (price > 3000) discountedPrice = (85.0 / 100.0) * price;
    }

    public static void display() {
        System.out.println("Name of the book: " + BName);
        System.out.println("MRP of the book: " + price);
        System.out.println("Discounted price of the book: " + discountedPrice);
    }
}

public class Program15 {
    public static void main(String[] args) {
        BookFair book = new BookFair();
        book.BName = "Harry Potter";
        book.price = 499;

        book.calculate();
        book.display();
    }
}
>>>>>>> done with the project
