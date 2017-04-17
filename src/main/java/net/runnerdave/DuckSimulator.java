package net.runnerdave;

/**
 * Hello world of ducks!
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator ds = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory gooseFactory = new GooseFactory();
        ds.simulate(duckFactory, gooseFactory);

    }

    void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
        Quackable mallard = duckFactory.createMallardDuck();
        Quackable rubber = duckFactory.createRubberDuck();
        Quackable redHead = duckFactory.createRedheadDuck();
        Quackable call = duckFactory.createDuckCall();
        Quackable gooseAdapted = gooseFactory.createGooseDuck();

        Flock flock = new Flock();
        flock.add(mallard);
        flock.add(rubber);
        flock.add(redHead);
        flock.add(call);
        flock.add(gooseAdapted);

        System.out.println("\nDuck simulator: with abstract factory and observer");

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);

        System.out.println("\nTotal number of Quacks:" + QuackCounter.getCounter());
    }

    void simulate(Quackable q) {
        q.quack();
    }
}
