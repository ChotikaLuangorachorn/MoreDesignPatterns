/**
 * Chotika Laungorachorn 5810404928
 */
package composite;

import abstractFactory.AbstractDuckFactory;
import abstractFactory.CountingDuckFactory;
import abstractFactory.CountingEchoDuckFactory;
import abstractFactory.DuckFactory;
import adapter.*;
import decorator.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        System.out.println("---Duck Factory---");
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duck) {
        Quackable mallardDuck = duck.createMallardDuck();
        Quackable redheadDuck = duck.createRedheadDuck();
        Quackable duckCall = duck.createDuckCall();
        Quackable rubberDuck = duck.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeon);

        simulate(flockOfDucks);

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}