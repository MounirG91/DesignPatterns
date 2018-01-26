package Decorator;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        super(beverage.getDescription());
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+" Milk";
    }

    public double cost() {
        return beverage.cost() + 0.8;
    }
}
