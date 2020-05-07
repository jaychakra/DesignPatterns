package Structural.Decorator.Imp3;

public class Mocha extends CondimentDecorator {
    String description = "Mocha";

    Mocha(Beverage beverage) {
        super(beverage);
        this.description = "Mocha";
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    double cost() {
        return 2.00 + this.beverage.cost();
    }
}
