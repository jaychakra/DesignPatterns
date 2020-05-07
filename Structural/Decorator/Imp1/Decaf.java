package Structural.Decorator.Imp1;

public class Decaf extends Beverage {
    Decaf() {
        super("Decaf");
    }

    @Override
    double cost() {
        return 5.99;
    }
}
