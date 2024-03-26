import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomeNumberGuess {
    public static void main(String[] args)
    {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = scan.nextLine();

            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 100 !");
            int myNumber = getRandomNumber(1, 100);
            int count = 0;
            int yourGuess = 0;
            do {
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Computer : What's your guess?");
                yourGuess = scan2.nextInt();
                if (yourGuess == myNumber) {
                    count++;
                    System.out.println("Computer : Congratulation ! You found in " + count + " attemps.");
                    break;
                } else if (yourGuess < myNumber) {
                    System.out.println("less !");
                } else if (yourGuess > myNumber) {
                    System.out.println("more ! ");
                }
                count++;
            } while (myNumber != yourGuess);
        }
        catch (NumberFormatException e)
        {
            System.out.println("You Enter Invalid Number ");
        }
        catch (InputMismatchException e)
        {
            System.out.println("You Enter Invalid Number ");

        }

    }
    public static int getRandomNumber(int min, int max)
    {
        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();
    }
}
