package Strategy.Imp2;
class Duck {
    protected String name;

    Duck() {
        this.name = "Duck";
    }

    void swim() {
        System.out.println(this.name + " is swimming **");
    }

    void display() {
        System.out.println(this.name + " looks cool **");
    }
}
