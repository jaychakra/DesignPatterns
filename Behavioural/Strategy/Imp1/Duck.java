package Strategy.Imp1;
class Duck {
    protected String name;

    Duck() {
        this.name = "Duck";
    }

    void quack() {
        System.out.println(this.name + " make quack sound **");
    }

    void swim() {
        System.out.println(this.name + " is swimming **");
    }

    void display() {
        System.out.println(this.name + " looks cool **");
    }

    /**
     * Added post enhancement request.
     * This needs to be overridden in every child class
     * which will be a maintenance nightmare
     */
    void fly() {
        System.out.println(this.name + " is flying **");
    }
}
