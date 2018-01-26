package Decorator.Beverage;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        super(beverage.getDescription());
        this.beverage = beverage;
    }

    public String getDescription() {
        return " Whip";
    }

    public double cost() {
        return beverage.cost()+0.5;
    }
}
