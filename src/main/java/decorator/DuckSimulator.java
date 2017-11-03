package decorator;

import adapter.*;

/**
 * Created by 708 on 11/3/2017.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        Quackable gooseDuck = new GooseAdapter(new Goose());
        PigeonAdapter pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Goose, Pigeon Adapter");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        simulate(gooseDuck);
        simulate(pigeon);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
