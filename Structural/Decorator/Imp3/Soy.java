package Structural.Decorator.Imp3;

public class Soy extends CondimentDecorator {
    Soy(Beverage beverage) {
        super(beverage);
        this.description = "Soy";
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    double cost() {
        return 3.00 + this.beverage.cost();
    }
}
