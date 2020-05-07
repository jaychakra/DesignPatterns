package Structural.Decorator.Imp2;

public class HouseBlend extends Beverage {
    HouseBlend() {
        super("House Blend");
    }

    @Override
    double cost() {
        return super.cost() + 10.50;
    }
}
