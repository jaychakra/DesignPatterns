package Behavioural.Strategy.Imp3.types.flyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("No Fly :(");
    }
}
