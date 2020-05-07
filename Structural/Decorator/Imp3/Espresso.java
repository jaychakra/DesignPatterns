package Decorator.Imp3;

public class Espresso extends Beverage {
    Espresso() {
        this.description = "Espresso";
    }

    @Override
    double cost() {
        return 9.59;
    }
}
