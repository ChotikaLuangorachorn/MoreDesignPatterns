package composite;

import adapter.Quackable;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        System.out.println("... First Duck Quack ...");
        for(Quackable duck: quackers){
            duck.quack();
        }
    }
}