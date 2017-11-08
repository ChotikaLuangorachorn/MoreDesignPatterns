package decorator;

import adapter.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    public QuackCounter(Quackable duck){ ;
        this.duck = duck;
        this.numberOfQuacks = 0;
    }
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        System.out.println("... " + numberOfQuacks+ " time");
    }
    public static int getQuacks(){
        return numberOfQuacks;
    }
}
