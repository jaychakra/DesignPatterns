package Structural.Decorator.Imp2;

public class Decaf extends Beverage {
    Decaf() {
        super("Decaf");
    }

    @Override
    double cost() {
        return super.cost() + 5.99;
    }
}
