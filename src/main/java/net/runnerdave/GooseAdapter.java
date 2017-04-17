package net.runnerdave;

/**
 * Created by davidajimenez on 15/04/2017.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    private Observable observable;

    GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    public void quack() {
        goose.honk();
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
