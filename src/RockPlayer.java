/**
 * Created by Antonella on 2/11/17.
 */
public class RockPlayer extends Player {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setValue(Roshambo value) {
        super.setValue(value);
    }

    @Override
    public Roshambo getValue() {
        return super.getValue();
    }

    @Override
    public Roshambo generateRoshambo() {
        //System.out.println(Roshambo.ROCK.toString());
        return Roshambo.ROCK;
    }
}
