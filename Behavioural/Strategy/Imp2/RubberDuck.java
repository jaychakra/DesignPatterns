package Behavioural.Strategy.Imp2;
import Behavioural.Strategy.Imp2.types.*;
class RubberDuck extends Duck implements Flyable{
    RubberDuck() {
        this.name = "RubberDuck";
    }

    @Override
    void display() {
        System.out.println(this.name + "  I have a rubberised look");
    }

    public void fly() {
        System.out.println(this.name + " can't fly");
    }
}
