package Decorator.Imp3;
abstract public class Beverage {
    String description = "Unknown Beverage";

    abstract double cost();

    String getDescription() {
        return this.description;
    }
}
