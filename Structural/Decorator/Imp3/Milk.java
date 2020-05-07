package Structural.Decorator.Imp3;

public class Milk extends CondimentDecorator {

    Milk(Beverage beverage) {
        super(beverage);
        this.description = "Milk";
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    double cost() {
        return 5.00 +  this.beverage.cost();
    }
}
