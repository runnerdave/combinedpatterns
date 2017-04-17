package net.runnerdave;

/**
 * Created by davidajimenez on 15/04/2017.
 */
public class RedHeadDuck implements Quackable {
    private Observable observable;

    public void quack() {
        System.out.println("Red Quack");
        notifyObservers();
    }

    public RedHeadDuck() {
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
