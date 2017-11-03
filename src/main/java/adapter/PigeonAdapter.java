package adapter;

/**
 * Created by 708 on 11/3/2017.
 */
public class PigeonAdapter implements Quackable {
    Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon){
        this.pigeon = pigeon;
    }
    public void quack() {
        this.pigeon.coo();
        this.pigeon.coo();
    }
}
