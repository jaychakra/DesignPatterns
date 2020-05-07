package Decorator.Imp3;

public class Decaf extends Beverage {
    Decaf() {
        this.description = "Decaf";
    }

    @Override
    double cost() {
        return 5.99;
    }
}
