package Decorator.Imp2;

public class Espresso extends Beverage {
    Espresso() {
        super("Espresso");
    }

    @Override
    double cost() {
        return super.cost() + 9.59;
    }
}
