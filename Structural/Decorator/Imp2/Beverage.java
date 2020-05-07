package Structural.Decorator.Imp2;
abstract public class Beverage {
    protected String description;
    protected Boolean milk;
    protected Boolean soy;
    protected Boolean mocha;
    protected Boolean whip;
    Beverage(String description) {
        this.description = description;
        this.milk = false;
        this.soy = false;
        this.mocha = false;
        this.whip = false;
    }

    double cost() {
        double cost = 0.00;

        if (this.hasMilk()) cost += 1.99;
        if (this.hasSoy()) cost += 1.29;
        if (this.hasMocha()) cost += 1.59;
        if (this.hasWhip()) cost += 1.89;

        return cost;
    }

    String getDescription() {
        return this.description;
    }

    public Boolean hasMilk() {
        return milk;
    }

    public void setMilk() {
        this.milk = true;
    }

    public Boolean hasSoy() {
        return soy;
    }

    public void setSoy() {
        this.soy = true;
    }

    public Boolean hasMocha() {
        return mocha;
    }

    public void setMocha() {
        this.mocha = true;
    }

    public Boolean hasWhip() {
        return whip;
    }

    public void setWhip() {
        this.whip = true;
    }


}
