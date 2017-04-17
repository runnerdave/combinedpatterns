package net.runnerdave;

/**
 * Created by davidajimenez on 17/04/2017.
 */
public class FlockObserver implements Observer {
    @Override
    public void update(QuackObservable flock) {
        System.out.println("Flock:" + flock + " quacked");
    }
}
