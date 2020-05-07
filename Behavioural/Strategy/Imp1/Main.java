package Strategy.Imp1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new RubberDuck());
        ducks.add(new RedheadDuck());

        for (Duck d: ducks) {
            d.display();
            d.quack();
            d.swim();
            d.fly();
        }
    }
}
