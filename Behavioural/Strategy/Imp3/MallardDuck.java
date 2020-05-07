package Behavioural.Strategy.Imp3;

import Behavioural.Strategy.Imp3.types.flyBehaviour.FlyWithWings;
import Behavioural.Strategy.Imp3.types.quackBehaviour.Squeak;

class MallardDuck extends Duck {
    MallardDuck() {
        super(new FlyWithWings(), new Squeak());
        this.name="MallardDuck";
    }
    @Override
    void display() {
        System.out.println(this.name + " looks cool");
    }
}
