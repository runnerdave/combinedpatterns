package net.runnerdave;

/**
 * Created by davidajimenez on 15/04/2017.
 */
public class RubberDuck implements Quackable {
    private Observable observable;
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
