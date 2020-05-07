package Strategy.Imp2;

public class Main {

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        DecoyDuck dd = new DecoyDuck();
        RubberDuck rd = new RubberDuck();
        RedheadDuck rhd = new RedheadDuck();

        // Design flaws: Since all of them are not coded to an interface hence a lot of code repetition
        md.display();
        md.quack();
        md.swim();
        md.fly();

        dd.display();
        dd.quack();
        dd.swim();
        dd.fly();

        rd.display();
//        rd.quack();
        rd.swim();
        rd.fly();

        rhd.display();
//        rhd.quack();
        rhd.swim();
//        rhd.fly();

    }
}
