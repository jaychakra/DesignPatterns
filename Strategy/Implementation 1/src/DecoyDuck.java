class DecoyDuck extends Duck{
    DecoyDuck() {
        this.name = "DecoyDuck";
    }
    @Override
    void display() {
        System.out.println(this.name + " God knows how I look");
    }
}
