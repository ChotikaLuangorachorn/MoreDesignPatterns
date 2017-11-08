package abstractFactory;

import adapter.Goose;
/** Chotika Laungorachorn 5810404928
 */
import adapter.Quackable;
import decorator.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        System.out.println("---Duck Factory---");
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);

        System.out.println("---Counting Duck Factory---");
        AbstractDuckFactory  countingFactory= new CountingDuckFactory();
        simulator.simulate(countingFactory);

        System.out.println("---Counting Echo Duck Factory---");
        AbstractDuckFactory  countingEchoFactory= new CountingEchoDuckFactory();
        simulator.simulate(countingEchoFactory);
    }
    void simulate(AbstractDuckFactory duck) {
        Quackable mallardDuck = duck.createMallardDuck();
        Quackable redheadDuck = duck.createRedheadDuck();
        Quackable duckCall = duck.createDuckCall();
        Quackable rubberDuck = duck.createRubberDuck();

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times\n");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}