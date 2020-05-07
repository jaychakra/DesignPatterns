package Behavioural.Strategy.Imp2;

class RedheadDuck extends Duck {
    RedheadDuck() {
        this.name = "ReadHeadDuck";
    }

    @Override
    void display() {
        System.out.println(this.name + " I have a red head");
    }
}

