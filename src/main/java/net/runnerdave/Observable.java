package net.runnerdave;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidajimenez on 17/04/2017.
 */
public class Observable implements QuackObservable {
    List<Observer> observables = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observables.add(observer);
    }

    @Override
    public void notifyObservers() {
        observables.forEach(s -> s.update(duck));
    }
}
