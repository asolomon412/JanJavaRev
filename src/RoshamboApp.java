import java.util.Scanner;

public class RoshamboApp {
    private static String name;
    private static String opponentName;


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        String userInput;

        do {

            System.out.println("Please enter your name: ");
            name = scan.nextLine();
            System.out.println("Hi, " + name + "!");
            System.out.println();
            System.out.println("Please select an opponent: ");
            System.out.println("1. Antonella ");
            System.out.println("2. The Rock (DeWayne Johnson) ");
            System.out.println("3. 2 Players ");
            opponentName = scan.nextLine();

            String gameChoice;

            switch (opponentName) {
                case "Antonella":
                case "1":
                    // this case is going to return my rock player
                    opponentName = "Antonella";
                    RockPlayer r1 = new RockPlayer();
                    gameChoice = promptGame(scan);
                    //r1.generateRoshambo(); // removed this to demonstrate that the method call can be directly passed into the parameter
                    System.out.println(name + ": " + gameChoice + " | " + "Antonella: " + r1.generateRoshambo());
                    determineWinner(gameChoice, r1.generateRoshambo());
                    break;
                case "The Rock":
                case "2":
                    // this case is going to return my random player
                    RandomPlayer r2 = new RandomPlayer();
                    opponentName = "The Rock (DeWayne Johnson)";
                    gameChoice = promptGame(scan);
                    Roshambo winner2 = r2.generateRoshambo();
                    System.out.println(name + ": " + gameChoice + " | " + "The Rock (DeWayne Johnson): " + winner2);
                    determineWinner(gameChoice, winner2);
                    break;
                case "2 Players":
                case "3":
                    // this case is for the human player
                    HumanPlayer h1 = new HumanPlayer();
                    gameChoice = promptGame(scan);
                    System.out.println();
                    System.out.println("Please enter the name of the second player: ");
                    String hPlayer = scan.nextLine();
                    System.out.println("Okay, " + hPlayer + "!");
                    System.out.println();
                    opponentName = hPlayer;
                    Roshambo winner3 = h1.generateRoshambo();
                    System.out.println(name + ": " + gameChoice + " | " + hPlayer + ": " + winner3);
                    determineWinner(gameChoice, winner3);
                    break;
                default:
                    System.out.println();
                    System.out.println("Please enter a valid selection!");
                    break;


            }
            System.out.println();
            System.out.println("Do you want to continue? yes/no ");
            userInput = scan.nextLine();


        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");

    }

    // this method starts the game
    public static String promptGame(Scanner scan) {
        System.out.println();
        System.out.println("Okay, " + name + "!");
        System.out.println("Let's Play Rock, Paper, Scissors!");
        System.out.println("Pick your selection: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        String userChoice = scan.nextLine();
        return userChoice;
    }

    // this method determines a winner
    public static void determineWinner(String userValue, Roshambo computerValue) {

        String computer = computerValue.toString();

        if (computer.equals(userValue)) {
            System.out.println("Draw!");
        } else if (userValue.equalsIgnoreCase("rock") && computer.equals("scissors")) {
            System.out.println(name + " wins!");
        } else if (userValue.equalsIgnoreCase("scissors") && computer.equals("paper")) {
            System.out.println(name + " wins!");
        } else if (userValue.equalsIgnoreCase("paper") && computer.equals("rock")) {
            System.out.println(name + " wins!");
        } else {
            System.out.println(opponentName + " wins!");
        }
    }
}
