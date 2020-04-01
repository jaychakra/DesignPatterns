package Decorator.Imp3;

abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    abstract String getDescription();
}
