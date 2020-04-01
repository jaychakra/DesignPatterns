package Decorator.Imp2;

public class Main {

    public static void main(String[] args) {
        Beverage dr = new DarkRoast();
        dr.setMilk();
        dr.setMocha();
        System.out.println(dr.description + " costs: " + dr.cost());
        Beverage decaf = new Decaf();
        decaf.setSoy();
        decaf.setMocha();

        System.out.println(decaf.description + " costs: " + decaf.cost());
    }
}
