import java.util.Scanner;

class MovieMagic {
    public static int year;
    public static String title;
    public static float rating;

    public MovieMagic() {
        year = 0;
        title = "";
        rating = 0;
    }
}

class Program3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic();
        accept(movie);
        display(movie);
    }

    public static void accept(MovieMagic movie) {
        System.out.println("Enter the name of the movie: ");
        movie.title = sc.nextLine();
        System.out.println("Enter the year of the movie: ");
        movie.year = sc.nextInt();
        int i = 0;
        while (i == 0) {
            System.out.println("Enter the rating of the movie: ");
            movie.rating = sc.nextFloat();
            if (movie.rating > 5 || movie.rating < 0) {
                System.out.println("Enter a valid rating between 0-5.");
                continue;
            }
            i = 1;
        }
    }

    public static void display(MovieMagic movie) {
        if (movie.rating > 0 && movie.rating < 2.1)
            System.out.println(movie.title + " was a flop movie from the year " + movie.year + ".");
        else if (movie.rating > 2 && movie.rating < 3.5)
            System.out.println(movie.title + " was a semi-hit movie from the year " + movie.year + ".");
        else if (movie.rating > 3.4 && movie.rating < 4.6)
            System.out.println(movie.title + " was a hit movie from the year " + movie.year + ".");
        else
            System.out.println(movie.title + " was a super hit movie from the year " + movie.year + ".");
    }

}
