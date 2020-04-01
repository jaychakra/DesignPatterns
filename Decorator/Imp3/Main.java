package Decorator.Imp3;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " costs: " + beverage.cost());
    }
}
