package Strategy.Imp3;


import Strategy.Imp3.types.flyBehaviour.FlyWithWings;
import Strategy.Imp3.types.quackBehaviour.Squeak;

class RedheadDuck extends Duck {
    RedheadDuck() {
        super(new FlyWithWings(), new Squeak());
        this.name = "ReadHeadDuck";
    }

    @Override
    void display() {
        System.out.println(this.name + " I have a red head");
    }
}

