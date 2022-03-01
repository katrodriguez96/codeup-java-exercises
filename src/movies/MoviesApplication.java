package movies;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        Movie[] moviesArr = MoviesArray.findAll();
        do {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the comedy category");
            System.out.println("4 - view movies in the drama category");
            System.out.println("5 - view movies in the horror category");
            System.out.println("6 - view movies in the musical category");
            System.out.println("7 - view movies in the scifi category");
            System.out.println("8 - add new movie to list");
            System.out.print("\nEnter your choice: ");
            userInput = sc.nextLine();
            System.out.println();
            switch (userInput) {
                case "0":
                    System.out.println("Now exiting application.");
                    break;
                case "1":
                    // view all movies
                    for (Movie movie : moviesArr) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case "2":
                    // view animated movies
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "3":
                    // view comedy movies
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equals("comedy")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "4":
                    // view drama movies
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "5":
                    // view horror movies
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "6":
                    // view musical movies
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equals("musical")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "7":
                    // view scifi movies
                    for (Movie movie: moviesArr) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "8":
                    // add movie to MoviesArray
                    break;
                default:
                    System.out.println("Invalid input, try again.");
            }
        } while (!userInput.equals("0"));
    }
}
