/**
 * Created by Antonella on 2/11/17.
 */
public abstract class Player {
    private String name;
    private Roshambo value;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Roshambo value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }


    public Roshambo getValue() {
        return value;
    }


    public abstract Roshambo generateRoshambo();
}
