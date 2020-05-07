package Behavioural.Strategy.Imp3.types.quackBehaviour;

public class Mute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No Sound");
    }
}
