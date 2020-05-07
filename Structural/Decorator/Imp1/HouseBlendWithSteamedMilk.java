package Decorator.Imp1;

public class HouseBlendWithSteamedMilk extends Beverage {
    HouseBlendWithSteamedMilk() {
        super("House Blend With Steamed Milk");
    }

    @Override
    double cost() {
        return 12.39;
    }
}
