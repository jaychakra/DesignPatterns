package Structural.Decorator.Imp1;
abstract public class Beverage {
    protected String description;
    Beverage(String description) {
        this.description = description;
    }

    abstract double cost();

    String getDescription() {
        return this.description;
    }
}
