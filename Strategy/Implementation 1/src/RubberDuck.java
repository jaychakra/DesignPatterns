class RubberDuck extends Duck {
    RubberDuck() {
        this.name = "RubberDuck";
    }

    @Override
    void display() {
        System.out.println(this.name + "  I have a rubberised look");
    }

    @Override
    void fly() {
        System.out.println(this.name + " can't fly");
    }
}
