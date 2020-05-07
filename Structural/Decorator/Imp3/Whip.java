package Structural.Decorator.Imp3;

public class Whip extends CondimentDecorator{
    Whip(Beverage beverage) {
        super(beverage);
        this.description = "Whip";
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    double cost() {
        return 4.00 + this.beverage.cost();
    }
}
