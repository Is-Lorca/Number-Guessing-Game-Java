import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String play_again;
        int random_num, option, guess, maxAttempts, min = 0, max, attempts;
        boolean checking_opt, playing = true;

        //welcome message
        System.out.println("Welcome to Number Guessing!");
        System.out.println("We have 3 levels:");
        System.out.println("Easy - Guess between 0-10;\nMedium - Guess between 0-30;\nHard - Guess between 0-50.\n");
        System.out.println("You have attempts equivalent to the difficulty you choose.");
        System.out.println("Easy - 5 attempts;\nMedium - 15 attempts;\nHard - 25 attempts.");

        //selecting level
        do{
            System.out.println("\nChoose the number of the level to start!");
            do{
                System.out.println("1-Easy;\n2-Medium;\n3-Hard.");
                System.out.println("Please select a valid option.");
                option = scanner.nextInt();
                //checking if option is valid
                if (option >= 1 && option <= 3){
                    checking_opt = true;
                }else{
                    checking_opt = false;
                }
                //repeat if it's not
            }while(!checking_opt);
            
            switch (option) {
                case 1 ->{
                    maxAttempts = 5;
                    max = 11;
                    attempts = maxAttempts;
                    random_num = random.nextInt(min, max);
                    System.out.println("\nThe number were selected!");
                    //repeat till the guess is equal the random number or till have no remaining attempts
                    do{
                        System.out.printf("You have %d attempts.\n", attempts);
                        System.out.print("Try to guess: ");
                        guess = scanner.nextInt();
                        System.out.print("\n");
                        attempts -= 1;
                        if(guess != random_num && attempts != 0){
                            if (guess > random_num){
                                System.out.println("Hint: The number is lower.");
                            }else{
                                System.out.println("Hint: The number is higher.");
                            }
                        }    
                    }while(guess != random_num && attempts != 0);
                    //if the guess is right and within the number of remaining attempts, you won
                    if(guess == random_num){
                        System.out.println("\nCongratulations, you won!");
                        System.out.printf("The number was %d and you guessed in %d attempts!", random_num, Math.abs(attempts - maxAttempts));
                    }
                    //otherwise, you lose.
                    else{
                        System.out.println("\nI'm sorry, you lost!");
                        System.out.printf("The number was %d.", random_num);
                    }
                    //continue to play or not
                    System.out.print("\nDo you want to play again? (Y/N): ");
                    play_again = scanner.next().toUpperCase();
                    if (play_again.contains("Y")){
                        playing = true;
                    }
                    else{
                        System.out.println("\nThank you for playing!");
                        playing = false;
                    }
                }
                    
                case 2 ->{
                    maxAttempts = 15;
                    max = 31;
                    attempts = maxAttempts;
                    random_num = random.nextInt(min, max);
                    System.out.println("\nThe number were selected!");

                    do{
                        System.out.printf("You have %d attempts.\n", attempts);
                        System.out.print("Try to guess: ");
                        guess = scanner.nextInt();
                        System.out.print("\n");
                        attempts -= 1;
                        if(guess != random_num && attempts != 0){
                            if (guess > random_num){
                                System.out.println("Hint: The number is lower.");
                            }else{
                                System.out.println("Hint: The number is higher.");
                            }
                        }    
                    }while(guess != random_num && attempts != 0);

                    if(guess == random_num){
                        System.out.println("\nCongratulations, you won!");
                        System.out.printf("The number was %d and you guessed in %d attempts!", random_num, Math.abs(attempts - maxAttempts));
                    }

                    else{
                        System.out.println("\nI'm sorry, you lost!");
                        System.out.printf("The number was %d.", random_num);
                    }

                    System.out.print("\nDo you want to play again? (Y/N): ");
                    play_again = scanner.next().toUpperCase();
                    if (play_again.contains("Y")){
                        playing = true;
                    }
                    else{
                        System.out.println("\nThank you for playing!");
                        playing = false;
                    }
                }

                case 3 ->{
                    maxAttempts = 25;
                    max = 51;
                    attempts = maxAttempts;
                    random_num = random.nextInt(min, max);
                    System.out.println("\nThe number were selected!");

                    do{
                        System.out.printf("You have %d attempts.\n", attempts);
                        System.out.print("Try to guess: ");
                        guess = scanner.nextInt();
                        System.out.print("\n");
                        attempts -= 1;
                        if(guess != random_num && attempts != 0){
                            if (guess > random_num){
                                System.out.println("Hint: The number is lower.");
                            }else{
                                System.out.println("Hint: The number is higher.");
                            }
                        }    
                    }while(guess != random_num && attempts != 0);

                    if(guess == random_num){
                        System.out.println("\nCongratulations, you won!");
                        System.out.printf("The number was %d and you guessed in %d attempts!", random_num, Math.abs(attempts - maxAttempts));
                    }

                    else{
                        System.out.println("\nI'm sorry, you lost!");
                        System.out.printf("The number was %d.", random_num);
                    }

                    System.out.print("\nDo you want to play again? (Y/N): ");
                    play_again = scanner.next().toUpperCase();
                    if (play_again.contains("Y")){
                        playing = true;
                    }
                    else{
                        System.out.println("\nThank you for playing!");
                        playing = false;
                    }
                }
            }

        }while(playing);
        scanner.close();
    }
}
