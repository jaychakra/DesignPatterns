package Decorator.Imp2;

public class DarkRoast extends Beverage {
    DarkRoast() {
        super("DarkRoast");
    }

    @Override
    public double cost() {
        return super.cost() + 11.29;
    }
}
