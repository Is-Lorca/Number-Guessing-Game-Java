import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int random_num, option, guess;

        //welcome message
        System.out.println("Welcome to Number Guessing!");
        System.out.println("Here, we have 3 levels:");
        System.out.println("Easy - Guess between 0-10;\nMedium - Guess between 0-30;\nHard - Guess between 0-50");
        System.out.println("Choose the number of the level to start!\n");

        //selecting level
        System.out.println("1-Easy;\n2-Medium;\n3-Hard.");
        option = scanner.nextInt();

        switch (option) {
            case 1 -> {

            }
            
            case 2 ->{

            }

            case 3 ->{

            }

            default -> System.out.println("Please select a valid option.");
                
        }

    }
}
