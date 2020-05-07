package Structural.Decorator.Imp1;

public class Main {

    public static void main(String[] args) {
        Beverage dr = new DarkRoast();
        Beverage hb = new HouseBlendWithSteamedMilkAndMocha();

        System.out.println(dr.description + " costs: " + dr.cost());
        System.out.println(hb.description + " costs: " + hb.cost());
    }
}
