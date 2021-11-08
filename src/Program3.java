import java.util.Scanner;

class MovieMagic {
    public static int year;
    public static String title;
    public static float rating;
    public static Scanner sc = new Scanner(System.in);

    public MovieMagic() {
        year = 0;
        title = "";
        rating = 0;
    }

    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic();
        movie.accept();
        movie.display();
    }

    public static void accept() {
        System.out.println("Enter the name of the movie: ");
        title = sc.nextLine();
        System.out.println("Enter the year of the movie: ");
        year = sc.nextInt();
        int i = 0;
        while (i == 0) {
            System.out.println("Enter the rating of the movie: ");
            rating = sc.nextFloat();
            if (rating > 5 || rating < 0) {
                System.out.println("Enter a valid rating between 0-5.");
                continue;
            }
            i = 1;
        }
    }

    public static void display() {
        if (rating > 0 && rating < 2.1)
            System.out.println(title + " was a flop movie from the year " + year + ".");
        else if (rating > 2 && rating < 3.5)
            System.out.println(title + " was a semi-hit movie from the year " + year + ".");
        else if (rating > 3.4 && rating < 4.6)
            System.out.println(title + " was a hit movie from the year " + year + ".");
        else
            System.out.println(title + " was a super hit movie from the year " + year + ".");
    }
}
