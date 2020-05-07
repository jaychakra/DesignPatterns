package Behavioural.Strategy.Imp3;

import Behavioural.Strategy.Imp3.types.flyBehaviour.FlyNoWay;
import Behavioural.Strategy.Imp3.types.quackBehaviour.Mute;

class RubberDuck extends Duck{
    RubberDuck() {
        super(new FlyNoWay(), new Mute());
        this.name = "RubberDuck";
    }

    @Override
    void display() {
        System.out.println(this.name + "  I have a rubberised look");
    }

}
