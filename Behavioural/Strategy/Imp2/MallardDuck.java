package Behavioural.Strategy.Imp2;
import Behavioural.Strategy.Imp2.types.*;
class MallardDuck extends Duck implements Flyable, Quackable{
    MallardDuck() {
        this.name="MallardDuck";
    }
    @Override
    void display() {
        System.out.println(this.name + " looks cool");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " flys like mallard");
    }

    @Override
    public void quack() {
        System.out.println(this.name + " quacks, quack quack");
    }
}
