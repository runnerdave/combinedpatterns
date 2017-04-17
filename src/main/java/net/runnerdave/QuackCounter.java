package net.runnerdave;

/**
 * Created by davidajimenez on 15/04/2017.
 */
public class QuackCounter implements Quackable {
    private static int counter;
    private Quackable quacker;

    public QuackCounter(Quackable quacker) {
        this.quacker = quacker;
    }

    static int getCounter() {
        return counter;
    }

    public void quack() {
        quacker.quack();
        counter++;
    }

    @Override
    public void registerObserver(Observer observer) {
        quacker.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quacker.notifyObservers();
    }
}
