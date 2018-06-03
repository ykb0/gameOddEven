import java.util.Random;
import java.util.Scanner;

public class GameOddEven {
    public static void main(String[] args){

        System.out.println("Lets play Odd-Even Game " + "\n" + "Choose between Odd/Even:");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userChoice = scanner.next();

        if(userChoice.equalsIgnoreCase("Odd") || userChoice.equalsIgnoreCase("O")){
            // or userChoice.toLowerCase().equalsWith("odd") || userChoice.toLowerCase().equalsWith("o")

            System.out.println("So, Your Choice is ODD and Computer's is EVEN" + "\n"
                    + "Let/'s play the game" + "\n"
                    + "Enter your Finger between 0-5");

            int userFinger = scanner.nextInt();

            if(userFinger <= 5 && userFinger >= 0){

                int computerFinger = random.nextInt(6);

                if(computerFinger <= 5 && computerFinger >= 0){

                    System.out.println("So, You Entered " + userFinger + " and Computer Entered " + computerFinger);

                    int total = userFinger + computerFinger;

                    if(total%2 == 0){
                        System.out.println("Computer Won!!");
                    }

                    else{
                        System.out.println("You Won!!");
                    }
                }
                else{
                    System.out.println("Oops! Try Again..");
                }
            }
            else{
                System.out.println("Oops! Try Again..");
            }
        }

        else if(userChoice.equalsIgnoreCase("Even") || userChoice.equalsIgnoreCase("e")){

            System.out.println("So, Your Choice is EVEN and Computer's is ODD" + "\n"
                    + "Let/'s play the game" + "\n"
                    + "Enter your Finger between 0-5");

            int userFinger = scanner.nextInt();

            if(userFinger <= 5 && userFinger >= 0){

                int computerFinger = random.nextInt(6);

                if(computerFinger <= 5 && computerFinger >= 0){

                    System.out.println("So, You Entered " + userFinger + " and Computer Entered " + computerFinger);

                    int total = userFinger + computerFinger;

                    if(total%2 == 0){
                        System.out.println("You Won!!");
                    }

                    else{
                        System.out.println("Computer Won!!");
                    }
                }
            }

        }
        else{
            System.out.println("Please Choose between ODD/EVEN");
            main(args);
        }

    }
}
