package net.runnerdave;

/**
 * Created by davidajimenez on 24/03/2017.
 */
public class MallardDuck implements Quackable {
    private Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
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
