package abstractFactory;

import adapter.Goose;
import adapter.GooseAdapter;
import adapter.Quackable;
import decorator.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        System.out.println("---DuckFactory---");
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);

        System.out.println("---CountingDuckFactory---");
        AbstractDuckFactory  countingFactory= new CountingDuckFactory();
        simulator.simulate(countingFactory);

        System.out.println("---CountingEchoDuckFactory---");
        AbstractDuckFactory  countingEchoFactory= new CountingEchoDuckFactory();
        simulator.simulate(countingEchoFactory);
    }
    void simulate(AbstractDuckFactory duck) {
        Quackable mallardDuck = duck.createMallardDuck();
        Quackable redheadDuck = duck.createRedheadDuck();
        Quackable duckCall = duck.createDuckCall();
        Quackable rubberDuck = duck.createRubberDuck();

        System.out.println("Duck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() +
 " times\n");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}