import java.util.Scanner;

/**
 * Created by Antonella on 2/11/17.
 */
public class HumanPlayer extends Player {
    @Override
    public Roshambo generateRoshambo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick your selection: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        String userChoice = scan.nextLine();

        if (userChoice.equalsIgnoreCase("rock")){
            //System.out.println("rock");
            return Roshambo.ROCK;
        } else if (userChoice.equalsIgnoreCase("paper")) {
            //System.out.println("paper");
            return Roshambo.PAPER;
        } else {
            //System.out.println("scissors");
            return Roshambo.SCISSORS;
        }


    }
}
