package Structural.Decorator.Imp3;

class DarkRoast extends Beverage {
    DarkRoast() {
        this.description = "Dark Roast";
    }
    @Override
    double cost() {
        return 11.29;
    }
}
