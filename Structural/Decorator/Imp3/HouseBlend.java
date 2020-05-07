package Decorator.Imp3;

public class HouseBlend extends Beverage {
    HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    double cost() {
        return 10.50;
    }
}
