package Structural.Decorator.Imp1;

public class HouseBlend extends Beverage {
    HouseBlend() {
        super("House Blend");
    }

    @Override
    double cost() {
        return 10.50;
    }
}
