package Decorator;

public class Mint extends CondimentDecorator {

    Beverage beverage;

    public Mint(Beverage beverage) {
        super(beverage.getDescription());
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+" Mint";
    }

    public double cost() {
        return beverage.cost() + 0.7;
    }
}
