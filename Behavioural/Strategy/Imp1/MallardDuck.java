package Behavioural.Strategy.Imp1;
class MallardDuck extends Duck {
    MallardDuck() {
        this.name="MallardDuck";
    }
    @Override
    void display() {
        System.out.println(this.name + " looks cool");
    }
}
