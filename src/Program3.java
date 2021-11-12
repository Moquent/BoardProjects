// importing all the modules

import java.util.Scanner;

class MovieMagic {

    // declare all variables
    public static int year;
    public static String title;
    public static float rating;
    public static Scanner sc = new Scanner(System.in);

    // make a constructor to hold the properties
    public MovieMagic() {
        year = 0;
        title = "";
        rating = 0;
    }

    // make a main function to run the program
    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic();
        movie.accept();
        movie.display();
    }

    public static void accept() {

        // take inputs from the user about the details of the movie
        System.out.println("Enter the name of the movie: ");
        title = sc.nextLine();
        System.out.println("Enter the year of the movie: ");
        year = sc.nextInt();

        // prompt user to enter a valid rating if it is invalid
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

        // display the type of movie based on the details
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
