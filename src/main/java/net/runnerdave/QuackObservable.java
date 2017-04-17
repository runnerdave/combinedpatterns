package net.runnerdave;


/**
 * Created by davidajimenez on 17/04/2017.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
