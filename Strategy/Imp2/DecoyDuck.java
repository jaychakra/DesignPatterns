package Strategy.Imp2;

import Strategy.Imp2.types.*;

class DecoyDuck extends Duck implements Flyable, Quackable {
    DecoyDuck() {
        this.name = "DecoyDuck";
    }
    @Override
    void display() {
        System.out.println(this.name + " God knows how I look");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " fly like Decoy");
    }

    @Override
    public void quack() {
        System.out.println(this.name + " quacks like decoy, quack quack");
    }
}
