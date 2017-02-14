/**
 * Created by Antonella on 2/11/17.
 */
public enum Roshambo {


    ROCK, PAPER, SCISSORS;

    @Override
    public String toString() {

        String value = "";

        switch (ordinal()) {
            case 0:
                value = "rock";
                break;
            case 1:
                value = "paper";
                break;
            case 2:
                value = "scissors";
                break;
        }

        return value;
    }

}

