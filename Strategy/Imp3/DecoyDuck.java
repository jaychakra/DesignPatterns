package Strategy.Imp3;

import Strategy.Imp3.types.flyBehaviour.FlyWithWings;
import Strategy.Imp3.types.quackBehaviour.Quack;

class DecoyDuck extends Duck {
    DecoyDuck() {
        super(new FlyWithWings(), new Quack());
        this.name = "DecoyDuck";
    }
    @Override
    void display() {
        System.out.println(this.name + " God knows how I look");
    }
}
