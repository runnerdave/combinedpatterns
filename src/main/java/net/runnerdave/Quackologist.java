package net.runnerdave;

/**
 * Created by davidajimenez on 17/04/2017.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked");
    }
}
