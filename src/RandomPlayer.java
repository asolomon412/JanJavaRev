import java.util.Random;

/**
 * Created by Antonella on 2/11/17.
 */
public class RandomPlayer extends Player {
    @Override
    public Roshambo generateRoshambo() {

        Random rand = new Random();



        int randomNum = rand.nextInt((3 - 1) + 1) + 1;

        if (randomNum == 1) {
            //Roshambo.ROCK.toString();
            return Roshambo.ROCK;
        } else if (randomNum == 2) {
            //Roshambo.PAPER.toString();
            return Roshambo.PAPER;
        } else {
            //Roshambo.SCISSORS.toString();
            return Roshambo.SCISSORS;
        }

    }


}
