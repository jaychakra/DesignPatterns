package Structural.Decorator.Imp1;

public class DarkRoast extends Beverage {
    DarkRoast() {
        super("DarkRoast");
    }

    @Override
    double cost() {
        return 11.29;
    }
}
