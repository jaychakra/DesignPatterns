package Behavioural.Strategy.Imp3;

import Behavioural.Strategy.Imp3.types.flyBehaviour.FlyBehaviour;
import Behavioural.Strategy.Imp3.types.quackBehaviour.QuackBehaviour;

class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    protected String name;

    Duck(FlyBehaviour f, QuackBehaviour q) {
        this.name = "Duck";
        this.flyBehaviour = f;
        this.quackBehaviour = q;
    }

    void swim() {
        System.out.println(this.name + " is swimming **");
    }

    void display() {
        System.out.println(this.name + " looks cool **");
    }

    void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    void performFly() {
        flyBehaviour.fly();
    }
    void performQuack() {
        quackBehaviour.quack();
    }
}
