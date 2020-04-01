package Decorator.Imp1;

public class HouseBlendWithSteamedMilkAndMocha extends Beverage {
    HouseBlendWithSteamedMilkAndMocha() {
        super("House Blend With Steamed Milk And Mocha");
    }

    @Override
    double cost() {
        return 12.59;
    }
}
