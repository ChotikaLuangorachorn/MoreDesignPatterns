/** Chotika Laungorachorn 5810404928
 */
package decorator;

import adapter.*;


public class DuckSimulator {
    public static void main(String[] args) {
        System.out.println("---Decorator Pattern---");
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

        System.out.println("Duck Simulator: With Goose, Pigeon Adapter");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        simulate(gooseDuck);
        simulate(pigeon);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
