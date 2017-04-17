package net.runnerdave;

import java.util.ArrayList;

/**
 * Created by davidajimenez on 15/04/2017.
 */
public class Flock implements Quackable {
    ArrayList<Quackable> myFlock = new ArrayList<Quackable>();

    public Flock() {
    }

    public void add(Quackable q) {
        myFlock.add(q);
    }

    public void quack() {
        myFlock.forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        myFlock.forEach(q -> q.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
    }
}
