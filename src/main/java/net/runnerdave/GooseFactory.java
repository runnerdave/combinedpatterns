package net.runnerdave;

/**
 * Created by davidajimenez on 15/04/2017.
 */
public class GooseFactory extends AbstractGooseFactory {
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
