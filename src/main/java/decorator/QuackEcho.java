package decorator;

import adapter.Quackable;

/**
 * Created by 708 on 11/3/2017.
 */
public class QuackEcho implements Quackable {

    Quackable duck;
    public QuackEcho (Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        duck.quack();
    }
}
