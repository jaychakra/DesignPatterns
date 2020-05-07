package Structural.Decorator.Imp1;

public class Espresso extends Beverage {
    Espresso() {
        super("Espresso");
    }

    @Override
    double cost() {
        return 9.59;
    }
}
